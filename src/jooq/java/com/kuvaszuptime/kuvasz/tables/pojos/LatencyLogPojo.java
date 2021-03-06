/*
 * This file is generated by jOOQ.
 */
package com.kuvaszuptime.kuvasz.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "latency_log", uniqueConstraints = {
    @UniqueConstraint(name = "latency_log_pkey", columnNames = {"id"})
}, indexes = {
    @Index(name = "latency_log_monitor_idx", columnList = "monitor_id ASC")
})
public class LatencyLogPojo implements Serializable {

    private static final long serialVersionUID = -213764250;

    private Integer        id;
    private Integer        monitorId;
    private Integer        latency;
    private OffsetDateTime createdAt;

    public LatencyLogPojo() {}

    public LatencyLogPojo(LatencyLogPojo value) {
        this.id = value.id;
        this.monitorId = value.monitorId;
        this.latency = value.latency;
        this.createdAt = value.createdAt;
    }

    public LatencyLogPojo(
        Integer        id,
        Integer        monitorId,
        Integer        latency,
        OffsetDateTime createdAt
    ) {
        this.id = id;
        this.monitorId = monitorId;
        this.latency = latency;
        this.createdAt = createdAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 32)
    public Integer getId() {
        return this.id;
    }

    public LatencyLogPojo setId(Integer id) {
        this.id = id;
        return this;
    }

    @Column(name = "monitor_id", nullable = false, precision = 32)
    @NotNull
    public Integer getMonitorId() {
        return this.monitorId;
    }

    public LatencyLogPojo setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
        return this;
    }

    @Column(name = "latency", nullable = false, precision = 32)
    @NotNull
    public Integer getLatency() {
        return this.latency;
    }

    public LatencyLogPojo setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }

    @Column(name = "created_at", nullable = false)
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LatencyLogPojo setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final LatencyLogPojo other = (LatencyLogPojo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (monitorId == null) {
            if (other.monitorId != null)
                return false;
        }
        else if (!monitorId.equals(other.monitorId))
            return false;
        if (latency == null) {
            if (other.latency != null)
                return false;
        }
        else if (!latency.equals(other.latency))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.monitorId == null) ? 0 : this.monitorId.hashCode());
        result = prime * result + ((this.latency == null) ? 0 : this.latency.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LatencyLogPojo (");

        sb.append(id);
        sb.append(", ").append(monitorId);
        sb.append(", ").append(latency);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}
