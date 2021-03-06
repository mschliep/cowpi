/*
 * This file is generated by jOOQ.
 */
package net.cowpi.oes.jooq;


import javax.annotation.Generated;

import net.cowpi.oes.jooq.tables.Conversation;
import net.cowpi.oes.jooq.tables.LocalKey;
import net.cowpi.oes.jooq.tables.ParticipantState;
import net.cowpi.oes.jooq.tables.Prekey;
import net.cowpi.oes.jooq.tables.RouterMailbox;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>conversation</code>.
     */
    public static final Conversation CONVERSATION = net.cowpi.oes.jooq.tables.Conversation.CONVERSATION;

    /**
     * The table <code>local_key</code>.
     */
    public static final LocalKey LOCAL_KEY = net.cowpi.oes.jooq.tables.LocalKey.LOCAL_KEY;

    /**
     * The table <code>participant_state</code>.
     */
    public static final ParticipantState PARTICIPANT_STATE = net.cowpi.oes.jooq.tables.ParticipantState.PARTICIPANT_STATE;

    /**
     * The table <code>prekey</code>.
     */
    public static final Prekey PREKEY = net.cowpi.oes.jooq.tables.Prekey.PREKEY;

    /**
     * The table <code>router_mailbox</code>.
     */
    public static final RouterMailbox ROUTER_MAILBOX = net.cowpi.oes.jooq.tables.RouterMailbox.ROUTER_MAILBOX;
}
