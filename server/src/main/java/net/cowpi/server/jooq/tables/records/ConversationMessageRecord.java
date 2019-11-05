/*
 * This file is generated by jOOQ.
 */
package net.cowpi.server.jooq.tables.records;


import javax.annotation.Generated;

import net.cowpi.server.jooq.tables.ConversationMessage;

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
public class ConversationMessageRecord extends UpdatableRecordImpl<ConversationMessageRecord> implements Record5<Long, Long, Long, byte[], Integer> {

    private static final long serialVersionUID = 735713;

    /**
     * Setter for <code>router.conversation_message.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>router.conversation_message.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>router.conversation_message.conversation_id</code>.
     */
    public void setConversationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>router.conversation_message.conversation_id</code>.
     */
    public Long getConversationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>router.conversation_message.message_index</code>.
     */
    public void setMessageIndex(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>router.conversation_message.message_index</code>.
     */
    public Long getMessageIndex() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>router.conversation_message.message</code>.
     */
    public void setMessage(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>router.conversation_message.message</code>.
     */
    public byte[] getMessage() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>router.conversation_message.oes_response_count</code>.
     */
    public void setOesResponseCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>router.conversation_message.oes_response_count</code>.
     */
    public Integer getOesResponseCount() {
        return (Integer) get(4);
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
    public Row5<Long, Long, Long, byte[], Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, byte[], Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ConversationMessage.CONVERSATION_MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ConversationMessage.CONVERSATION_MESSAGE.CONVERSATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ConversationMessage.CONVERSATION_MESSAGE.MESSAGE_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return ConversationMessage.CONVERSATION_MESSAGE.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ConversationMessage.CONVERSATION_MESSAGE.OES_RESPONSE_COUNT;
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
        return getConversationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMessageIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOesResponseCount();
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
        return getConversationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMessageIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOesResponseCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord value2(Long value) {
        setConversationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord value3(Long value) {
        setMessageIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord value4(byte... value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord value5(Integer value) {
        setOesResponseCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConversationMessageRecord values(Long value1, Long value2, Long value3, byte[] value4, Integer value5) {
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
     * Create a detached ConversationMessageRecord
     */
    public ConversationMessageRecord() {
        super(ConversationMessage.CONVERSATION_MESSAGE);
    }

    /**
     * Create a detached, initialised ConversationMessageRecord
     */
    public ConversationMessageRecord(Long id, Long conversationId, Long messageIndex, byte[] message, Integer oesResponseCount) {
        super(ConversationMessage.CONVERSATION_MESSAGE);

        set(0, id);
        set(1, conversationId);
        set(2, messageIndex);
        set(3, message);
        set(4, oesResponseCount);
    }
}
