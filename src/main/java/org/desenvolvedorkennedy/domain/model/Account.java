package org.desenvolvedorkennedy.domain.model;

import java.math.BigDecimal;

public class Account {
    
    private Long id;
    private String number;
    private String agency;
    private BigDecimal limit;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getLimit() {
        return this.limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
