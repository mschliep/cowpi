/*
 * This file is generated by jOOQ.
 */
package net.cowpi.oes.jooq.tables.records;


import javax.annotation.Generated;

import net.cowpi.oes.jooq.tables.ParticipantState;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParticipantStateRecord extends UpdatableRecordImpl<ParticipantStateRecord> implements Record6<Long, String, byte[], Long, Long, byte[]> {

    private static final long serialVersionUID = -1190148505;

    /**
     * Setter for <code>participant_state.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>participant_state.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>participant_state.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>participant_state.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>participant_state.longterm_key</code>.
     */
    public void setLongtermKey(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>participant_state.longterm_key</code>.
     */
    public byte[] getLongtermKey() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>participant_state.conversation</code>.
     */
    public void setConversation(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>participant_state.conversation</code>.
     */
    public Long getConversation() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>participant_state.remote_ephemeral_key_id</code>.
     */
    public void setRemoteEphemeralKeyId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>participant_state.remote_ephemeral_key_id</code>.
     */
    public Long getRemoteEphemeralKeyId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>participant_state.remote_ephemeral_key</code>.
     */
    public void setRemoteEphemeralKey(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>participant_state.remote_ephemeral_key</code>.
     */
    public byte[] getRemoteEphemeralKey() {
        return (byte[]) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, byte[], Long, Long, byte[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, byte[], Long, Long, byte[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ParticipantState.PARTICIPANT_STATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ParticipantState.PARTICIPANT_STATE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return ParticipantState.PARTICIPANT_STATE.LONGTERM_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ParticipantState.PARTICIPANT_STATE.CONVERSATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return ParticipantState.PARTICIPANT_STATE.REMOTE_EPHEMERAL_KEY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return ParticipantState.PARTICIPANT_STATE.REMOTE_EPHEMERAL_KEY;
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
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getLongtermKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getConversation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRemoteEphemeralKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getRemoteEphemeralKey();
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
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getLongtermKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getConversation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRemoteEphemeralKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getRemoteEphemeralKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value3(byte... value) {
        setLongtermKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value4(Long value) {
        setConversation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value5(Long value) {
        setRemoteEphemeralKeyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord value6(byte... value) {
        setRemoteEphemeralKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParticipantStateRecord values(Long value1, String value2, byte[] value3, Long value4, Long value5, byte[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParticipantStateRecord
     */
    public ParticipantStateRecord() {
        super(ParticipantState.PARTICIPANT_STATE);
    }

    /**
     * Create a detached, initialised ParticipantStateRecord
     */
    public ParticipantStateRecord(Long id, String username, byte[] longtermKey, Long conversation, Long remoteEphemeralKeyId, byte[] remoteEphemeralKey) {
        super(ParticipantState.PARTICIPANT_STATE);

        set(0, id);
        set(1, username);
        set(2, longtermKey);
        set(3, conversation);
        set(4, remoteEphemeralKeyId);
        set(5, remoteEphemeralKey);
    }
}
