package com.study.kokkokapi.persistence.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Table(name = "area")
@Convert(converter = KindConverter.class, attributeName = "kind")
public class AreaEntity {
    @Id
    @Column(name = "area_no", length = 10)
    private String areaNo;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Column(name = "address", length = 50, nullable = false)
    private String address;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "phone")
    private String phone;

    @Column(name = "intro")
    private String intro;

    @Column(name = "time")
    private String time;

    @Column(name = "cost")
    private String cost;

    @Column(name = "kind")
    private Kind kind;

    public enum Kind {
        TOURISM, LEISURE, CULTURE;

        public String toDbValue() {
            return this.name().toLowerCase();
        }

        public static Kind from(String dbData) {
            return Kind.valueOf(dbData.toUpperCase());
        }
    }
}
