package com.1235.model;

import javax.persistence.*;

@Entity
@Table(name="branches")
public class Branches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="wholesaler")
    private String wholesaler;

    @Column(name="number")
    private Integer number;

    @Column(name="name")
    private String name;

    @Column(name="nfrn_region")
    private String nfrnRegion;

    @Column(name="tv_region")
    private String tvRegion;

    @Column(name="no_aatsat_values")
    private String noAATSATValues;

    @Column(name="active")
    private String active;

    @Column(name="date_created")
    private String dateCreated;

    @Column(name="last_modified")
    private String lastModified;

    public Branches() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWholesaler() {
        return wholesaler;
    }

    public void setWholesaler(String wholesaler) {
        this.wholesaler = wholesaler;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNFRNRegion() {
        return nfrnRegion;
    }

    public void setNFRNRegion(String nfrnRegion) {
        this.nfrnRegion = nfrnRegion;
    }

    public String getTVRegion() {
        return tvRegion;
    }

    public void setTVRegion(String tvRegion) {
        this.tvRegion = tvRegion;
    }

    public String getNoAATSATValues() {
        return noAATSATValues;
    }

    public void setNoAATSATValues(String noAATSATValues) {
        this.noAATSATValues = noAATSATValues;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}