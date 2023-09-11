package com.ezcode.ezprocure.security;

import com.ezcode.ezprocure.security.jwt.AuthEntryPointJwt;
import com.ezcode.ezprocure.security.jwt.AuthTokenFilter;
import com.ezcode.ezprocure.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.header.HeaderWriter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;



@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {

  @Autowired
  UserDetailsServiceImpl userDetailsService;

  @Bean
  public AuthTokenFilter authenticationJwtTokenFilter() {
    return new AuthTokenFilter();
  }

  @Bean
  public DaoAuthenticationProvider authenticationProvider(UserDetailsServiceImpl userDetailsService) {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

    authProvider.setUserDetailsService(userDetailsService);
    authProvider.setPasswordEncoder(passwordEncoder());

    return authProvider;
  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
    return authConfig.getAuthenticationManager();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  /**
   * @Bean public SecurityFilterChain filterChain(HttpSecurity http,
   *       UserDetailsServiceImpl userDetailsService, AuthEntryPointJwt
   *       unauthorizedHandler) throws Exception {
   *
   *
   *       http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
   *       //http.cors().and().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
   *       .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
   *       .antMatchers("/api/auth/**").permitAll().antMatchers("/actuator/env/**").permitAll()
   *       .antMatchers("/actuator/logfile/**").permitAll().antMatchers("/api/test/**").permitAll()
   *       .antMatchers("/v3/api-docs/**", "/swagger-ui.html",
   *       "/swagger-ui/**").permitAll() // Allow access to // Swagger endpoints
   *       .anyRequest().authenticated();
   *
   *       http.headers(this::configureSecurityHeaders);
   *
   *       http.authenticationProvider(authenticationProvider(userDetailsService));
   *
   *       http.addFilterBefore(authenticationJwtTokenFilter(),
   *       UsernamePasswordAuthenticationFilter.class);
   *
   *       return http.build(); }
   **/
  /**
   * @Bean public SecurityFilterChain filterChain(HttpSecurity http,
   *       AuthEntryPointJwt unauthorizedHandler, UserDetailsServiceImpl
   *       userDetailsService) throws Exception {
   *       http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
   *       .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
   *       .antMatchers("/api/auth/**").permitAll().antMatchers("/actuator/env/**").permitAll()
   *       .antMatchers("/actuator/logfile/**").permitAll().antMatchers("/api/test/**").permitAll()
   *       .antMatchers("/v3/api-docs/**", "/swagger-ui.html",
   *       "/swagger-ui/**").permitAll().anyRequest() .authenticated();
   *       http.headers(this::configureSecurityHeaders);
   *       http.authenticationProvider(authenticationProvider(userDetailsService));
   *       http.addFilterBefore(authenticationJwtTokenFilter(),
   *       UsernamePasswordAuthenticationFilter.class); return http.build(); }
   **/
  @Bean
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.addAllowedMethod("*"); // Replace with your allowed methods
    configuration.addAllowedHeader("*"); // Replace with your allowed headers
    configuration.setAllowCredentials(true);

    // Allow all origins except localhost:8080
    /** configuration.addAllowedOriginPattern("^(?!.*://localhost:8080).*"); **/
    configuration.addAllowedOriginPattern("*");
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }

  /**
   * @Bean public SecurityFilterChain filterChain(HttpSecurity http,
   *       AuthEntryPointJwt unauthorizedHandler, UserDetailsServiceImpl
   *       userDetailsService) throws Exception {
   *
   *       // NOSONAR: Reason for ignoring this issue or code block http.csrf(csrf
   *       -> csrf.ignoringAntMatchers("/api/auth/**", "/api/public/**",
   *       "/actuator/**", "/api/test/**", "/apps/dev/tisinstallationapi/**",
   *       "/apps/qc/tisinstallationapi/**", "/apps/qc/tisinstallationapi/**",
   *       "http://localhost:8080/**", "http://stage.www.india.com/**"))
   *       .cors(corsConfigurer ->
   *       corsConfigurer.configurationSource(corsConfigurationSource()))
   *       .addFilterBefore(authenticationJwtTokenFilter(),
   *       UsernamePasswordAuthenticationFilter.class)
   *       .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and().sessionManagement()
   *       .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
   *       .antMatchers("/api/auth/**").permitAll().antMatchers("/actuator/env/**").permitAll()
   *       .antMatchers("/actuator/logfile/**").permitAll().antMatchers("/api/test/**").permitAll()
   *       .antMatchers("/v3/api-docs/**", "/swagger-ui.html",
   *       "/swagger-ui/**").permitAll().anyRequest() .authenticated();
   *       http.headers(this::configureSecurityHeaders);
   *
   *       http.authenticationProvider(authenticationProvider(userDetailsService));
   *
   *       return http.build(); }
   **/
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http, AuthEntryPointJwt unauthorizedHandler,
                                         UserDetailsServiceImpl userDetailsService) throws Exception {

    http.
            cors(corsConfigurer -> corsConfigurer.configurationSource(corsConfigurationSource()))
            .addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class)
            .exceptionHandling()
            .authenticationEntryPoint(unauthorizedHandler)
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
            .antMatchers("/api/auth/**").permitAll()
            .antMatchers("/api/vend/**").permitAll()
            .antMatchers("/actuator/env/**").permitAll()
            .antMatchers("/actuator/logfile/**").permitAll()
            .antMatchers("/api/test/**").permitAll()
            .antMatchers("/v3/api-docs/**", "/swagger-ui.html", "/swagger-ui/**").permitAll()
            .anyRequest()
            .authenticated();
            http.headers(this::configureSecurityHeaders);
            http.authenticationProvider(authenticationProvider(userDetailsService));
            http.csrf(AbstractHttpConfigurer::disable);

    return http.build();
  }

  private static final String[] AUTH_WHITELIST={
          "api/v1/auth/**",
          "v3/api/api-docs/**",
          "v3/api/api-docs.yaml",
          "/swagger-ui/**",
          "/swagger-ui.html"
  };

  private void configureSecurityHeaders(HeadersConfigurer<HttpSecurity> headers) {
    headers
            /*
             * This configuration disables the X-Content-Type-Options header. When this
             * header is enabled, it prevents browsers from MIME-sniffing the response
             * content type and forces it to adhere to the declared content type. Disabling
             * it allows the browser to perform MIME-sniffing.
             */
            .contentTypeOptions().disable()
            /*
             * This configuration enables the X-XSS-Protection header and sets it to block
             * mode. When this header is set to block mode, the browser will block the
             * rendering of the page if it detects a potential cross-site scripting attack
             * (XSS). This provides an additional layer of protection against XSS
             * vulnerabilities
             */
            .xssProtection().block(true).and().addHeaderWriter(createContentSecurityPolicyHeaderWriter())
            // This helps to mitigate the risk of clickjacking attacks by limiting the scope
            // of framing to the same site
            .addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN));
  }

  private HeaderWriter createContentSecurityPolicyHeaderWriter() {
    /*
     * enforcing a strict policy that restricts the loading of resources to those
     * originating from the same domain. Any attempt to load resources from external
     * domains or sources will be blocked by the browser, providing an additional
     * layer of protection against certain types of attacks, such as cross-site
     * scripting (XSS) or data injection.
     */
    /**
     * String policyDirectives = "default-src 'self'"; return new
     * StaticHeadersWriter("Content-Security-Policy", policyDirectives);
     **/

    String policyDirectives = "default-src 'self' 'unsafe-inline'";
    return new StaticHeadersWriter("Content-Security-Policy", policyDirectives);

  }
}