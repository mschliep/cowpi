/*
 * This file is generated by jOOQ.
 */
package net.cowpi.oes.jooq.tables.records;


import javax.annotation.Generated;

import net.cowpi.oes.jooq.tables.LocalKey;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class LocalKeyRecord extends UpdatableRecordImpl<LocalKeyRecord> implements Record4<Long, Long, Long, byte[]> {

    private static final long serialVersionUID = 1312991999;

    /**
     * Setter for <code>local_key.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>local_key.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>local_key.state</code>.
     */
    public void setState(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>local_key.state</code>.
     */
    public Long getState() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>local_key.local_ephemeral_key_id</code>.
     */
    public void setLocalEphemeralKeyId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>local_key.local_ephemeral_key_id</code>.
     */
    public Long getLocalEphemeralKeyId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>local_key.local_ephemeral_priv_key</code>.
     */
    public void setLocalEphemeralPrivKey(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>local_key.local_ephemeral_priv_key</code>.
     */
    public byte[] getLocalEphemeralPrivKey() {
        return (byte[]) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LocalKey.LOCAL_KEY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LocalKey.LOCAL_KEY.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return LocalKey.LOCAL_KEY.LOCAL_EPHEMERAL_KEY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return LocalKey.LOCAL_KEY.LOCAL_EPHEMERAL_PRIV_KEY;
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
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getLocalEphemeralKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getLocalEphemeralPrivKey();
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
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getLocalEphemeralKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getLocalEphemeralPrivKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalKeyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalKeyRecord value2(Long value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalKeyRecord value3(Long value) {
        setLocalEphemeralKeyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalKeyRecord value4(byte... value) {
        setLocalEphemeralPrivKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalKeyRecord values(Long value1, Long value2, Long value3, byte[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocalKeyRecord
     */
    public LocalKeyRecord() {
        super(LocalKey.LOCAL_KEY);
    }

    /**
     * Create a detached, initialised LocalKeyRecord
     */
    public LocalKeyRecord(Long id, Long state, Long localEphemeralKeyId, byte[] localEphemeralPrivKey) {
        super(LocalKey.LOCAL_KEY);

        set(0, id);
        set(1, state);
        set(2, localEphemeralKeyId);
        set(3, localEphemeralPrivKey);
    }
}
