package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MUserType} entity
 */
public class MUserTypeDto implements Serializable {
    private final int idUsertype;
    private final String nmUsertype;
    private final String cdUsertype;
    private final String crudAllow;

    public MUserTypeDto(int idUsertype, String nmUsertype, String cdUsertype, String crudAllow) {
        this.idUsertype = idUsertype;
        this.nmUsertype = nmUsertype;
        this.cdUsertype = cdUsertype;
        this.crudAllow = crudAllow;
    }

    public int getIdUsertype() {
        return idUsertype;
    }

    public String getNmUsertype() {
        return nmUsertype;
    }

    public String getCdUsertype() {
        return cdUsertype;
    }

    public String getCrudAllow() {
        return crudAllow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MUserTypeDto entity = (MUserTypeDto) o;
        return Objects.equals(this.idUsertype, entity.idUsertype) &&
                Objects.equals(this.nmUsertype, entity.nmUsertype) &&
                Objects.equals(this.cdUsertype, entity.cdUsertype) &&
                Objects.equals(this.crudAllow, entity.crudAllow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsertype, nmUsertype, cdUsertype, crudAllow);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idUsertype = " + idUsertype + ", " +
                "nmUsertype = " + nmUsertype + ", " +
                "cdUsertype = " + cdUsertype + ", " +
                "crudAllow = " + crudAllow + ")";
    }
}