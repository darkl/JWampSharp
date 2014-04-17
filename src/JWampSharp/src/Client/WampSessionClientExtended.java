package Client;

import Client.Realm.WampRealmProxy;
import Core.Contracts.Session.WampSessionClient;

import java.util.concurrent.CompletionStage;

/**
 * Created by Elad on 15/04/2014.
 */
public interface WampSessionClientExtended<TMessage> extends WampSessionClient<TMessage> {
    long getSession();

    WampRealmProxy getRealm();

    CompletionStage getOpenTask();

    void onConnectionOpen();

    void onConnectionClosed();
}