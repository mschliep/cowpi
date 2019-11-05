/*
 * This file is generated by jOOQ.
 */
package net.cowpi.server.jooq.tables.records;


import javax.annotation.Generated;

import net.cowpi.server.jooq.tables.OesMessage;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OesMessageRecord extends UpdatableRecordImpl<OesMessageRecord> implements Record5<Long, Long, Long, byte[], byte[]> {

    private static final long serialVersionUID = -992615501;

    /**
     * Setter for <code>router.oes_message.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>router.oes_message.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>router.oes_message.oes_service</code>.
     */
    public void setOesService(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>router.oes_message.oes_service</code>.
     */
    public Long getOesService() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>router.oes_message.conversation_message</code>.
     */
    public void setConversationMessage(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>router.oes_message.conversation_message</code>.
     */
    public Long getConversationMessage() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>router.oes_message.outgoing</code>.
     */
    public void setOutgoing(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>router.oes_message.outgoing</code>.
     */
    public byte[] getOutgoing() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>router.oes_message.message</code>.
     */
    public void setMessage(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>router.oes_message.message</code>.
     */
    public byte[] getMessage() {
        return (byte[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, byte[], byte[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, byte[], byte[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OesMessage.OES_MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return OesMessage.OES_MESSAGE.OES_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return OesMessage.OES_MESSAGE.CONVERSATION_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return OesMessage.OES_MESSAGE.OUTGOING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return OesMessage.OES_MESSAGE.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getOesService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getConversationMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getOutgoing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getOesService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getConversationMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getOutgoing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord value2(Long value) {
        setOesService(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord value3(Long value) {
        setConversationMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord value4(byte... value) {
        setOutgoing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord value5(byte... value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OesMessageRecord values(Long value1, Long value2, Long value3, byte[] value4, byte[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OesMessageRecord
     */
    public OesMessageRecord() {
        super(OesMessage.OES_MESSAGE);
    }

    /**
     * Create a detached, initialised OesMessageRecord
     */
    public OesMessageRecord(Long id, Long oesService, Long conversationMessage, byte[] outgoing, byte[] message) {
        super(OesMessage.OES_MESSAGE);

        set(0, id);
        set(1, oesService);
        set(2, conversationMessage);
        set(3, outgoing);
        set(4, message);
    }
}
