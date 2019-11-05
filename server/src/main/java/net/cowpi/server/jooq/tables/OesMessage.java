/*
 * This file is generated by jOOQ.
 */
package net.cowpi.server.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import net.cowpi.server.jooq.Indexes;
import net.cowpi.server.jooq.Keys;
import net.cowpi.server.jooq.Router;
import net.cowpi.server.jooq.tables.records.OesMessageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OesMessage extends TableImpl<OesMessageRecord> {

    private static final long serialVersionUID = 99902854;

    /**
     * The reference instance of <code>router.oes_message</code>
     */
    public static final OesMessage OES_MESSAGE = new OesMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OesMessageRecord> getRecordType() {
        return OesMessageRecord.class;
    }

    /**
     * The column <code>router.oes_message.id</code>.
     */
    public final TableField<OesMessageRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('router.oes_message_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>router.oes_message.oes_service</code>.
     */
    public final TableField<OesMessageRecord, Long> OES_SERVICE = createField("oes_service", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>router.oes_message.conversation_message</code>.
     */
    public final TableField<OesMessageRecord, Long> CONVERSATION_MESSAGE = createField("conversation_message", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>router.oes_message.outgoing</code>.
     */
    public final TableField<OesMessageRecord, byte[]> OUTGOING = createField("outgoing", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>router.oes_message.message</code>.
     */
    public final TableField<OesMessageRecord, byte[]> MESSAGE = createField("message", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>router.oes_message</code> table reference
     */
    public OesMessage() {
        this(DSL.name("oes_message"), null);
    }

    /**
     * Create an aliased <code>router.oes_message</code> table reference
     */
    public OesMessage(String alias) {
        this(DSL.name(alias), OES_MESSAGE);
    }

    /**
     * Create an aliased <code>router.oes_message</code> table reference
     */
    public OesMessage(Name alias) {
        this(alias, OES_MESSAGE);
    }

    private OesMessage(Name alias, Table<OesMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private OesMessage(Name alias, Table<OesMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OesMessage(Table<O> child, ForeignKey<O, OesMessageRecord> key) {
        super(child, key, OES_MESSAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Router.ROUTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.OES_MESSAGE_CONVERSATION_MESSAGE_OES_SERVICE_KEY, Indexes.OES_MESSAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OesMessageRecord, Long> getIdentity() {
        return Keys.IDENTITY_OES_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OesMessageRecord> getPrimaryKey() {
        return Keys.OES_MESSAGE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OesMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<OesMessageRecord>>asList(Keys.OES_MESSAGE_PKEY, Keys.OES_MESSAGE_CONVERSATION_MESSAGE_OES_SERVICE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OesMessageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OesMessageRecord, ?>>asList(Keys.OES_MESSAGE__OES_MESSAGE_OES_SERVICE_FKEY, Keys.OES_MESSAGE__OES_MESSAGE_CONVERSATION_MESSAGE_FKEY);
    }

    public OesService oesService() {
        return new OesService(this, Keys.OES_MESSAGE__OES_MESSAGE_OES_SERVICE_FKEY);
    }

    public ConversationMessage conversationMessage() {
        return new ConversationMessage(this, Keys.OES_MESSAGE__OES_MESSAGE_CONVERSATION_MESSAGE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessage as(String alias) {
        return new OesMessage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessage as(Name alias) {
        return new OesMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OesMessage rename(String name) {
        return new OesMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OesMessage rename(Name name) {
        return new OesMessage(name, null);
    }
}
