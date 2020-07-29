/*
 * This file is generated by jOOQ.
 */
package com.akobor.kuvasz.tables;


import com.akobor.kuvasz.DefaultSchema;
import com.akobor.kuvasz.Indexes;
import com.akobor.kuvasz.Keys;
import com.akobor.kuvasz.enums.UptimeStatus;
import com.akobor.kuvasz.tables.records.UptimeEventRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UptimeEvent extends TableImpl<UptimeEventRecord> {

    private static final long serialVersionUID = -2004053888;

    /**
     * The reference instance of <code>uptime_event</code>
     */
    public static final UptimeEvent UPTIME_EVENT = new UptimeEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UptimeEventRecord> getRecordType() {
        return UptimeEventRecord.class;
    }

    /**
     * The column <code>uptime_event.id</code>.
     */
    public final TableField<UptimeEventRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('kuvasz.uptime_event_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>uptime_event.monitor_id</code>.
     */
    public final TableField<UptimeEventRecord, Integer> MONITOR_ID = createField(DSL.name("monitor_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>uptime_event.status</code>. Status of the event
     */
    public final TableField<UptimeEventRecord, UptimeStatus> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(com.akobor.kuvasz.enums.UptimeStatus.class), this, "Status of the event");

    /**
     * The column <code>uptime_event.error</code>.
     */
    public final TableField<UptimeEventRecord, String> ERROR = createField(DSL.name("error"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>uptime_event.started_at</code>. The current event started at
     */
    public final TableField<UptimeEventRecord, OffsetDateTime> STARTED_AT = createField(DSL.name("started_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "The current event started at");

    /**
     * The column <code>uptime_event.ended_at</code>. The current event ended at
     */
    public final TableField<UptimeEventRecord, OffsetDateTime> ENDED_AT = createField(DSL.name("ended_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "The current event ended at");

    /**
     * Create a <code>uptime_event</code> table reference
     */
    public UptimeEvent() {
        this(DSL.name("uptime_event"), null);
    }

    /**
     * Create an aliased <code>uptime_event</code> table reference
     */
    public UptimeEvent(String alias) {
        this(DSL.name(alias), UPTIME_EVENT);
    }

    /**
     * Create an aliased <code>uptime_event</code> table reference
     */
    public UptimeEvent(Name alias) {
        this(alias, UPTIME_EVENT);
    }

    private UptimeEvent(Name alias, Table<UptimeEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private UptimeEvent(Name alias, Table<UptimeEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UptimeEvent(Table<O> child, ForeignKey<O, UptimeEventRecord> key) {
        super(child, key, UPTIME_EVENT);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.UPTIME_EVENT_ENDED_AT_IDX, Indexes.UPTIME_EVENT_MONITOR_IDX);
    }

    @Override
    public Identity<UptimeEventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UPTIME_EVENT;
    }

    @Override
    public UniqueKey<UptimeEventRecord> getPrimaryKey() {
        return Keys.UPTIME_EVENT_PKEY;
    }

    @Override
    public List<UniqueKey<UptimeEventRecord>> getKeys() {
        return Arrays.<UniqueKey<UptimeEventRecord>>asList(Keys.UPTIME_EVENT_PKEY, Keys.UPTIME_EVENT_KEY);
    }

    @Override
    public List<ForeignKey<UptimeEventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UptimeEventRecord, ?>>asList(Keys.UPTIME_EVENT__UPTIME_EVENT_MONITOR_ID_FKEY);
    }

    public Monitor monitor() {
        return new Monitor(this, Keys.UPTIME_EVENT__UPTIME_EVENT_MONITOR_ID_FKEY);
    }

    @Override
    public UptimeEvent as(String alias) {
        return new UptimeEvent(DSL.name(alias), this);
    }

    @Override
    public UptimeEvent as(Name alias) {
        return new UptimeEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UptimeEvent rename(String name) {
        return new UptimeEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UptimeEvent rename(Name name) {
        return new UptimeEvent(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, UptimeStatus, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
