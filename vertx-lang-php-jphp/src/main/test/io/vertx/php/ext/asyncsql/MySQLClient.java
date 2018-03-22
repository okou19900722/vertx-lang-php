package io.vertx.php.ext.asyncsql;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.asyncsql.AsyncSQLClient;
import io.vertx.php.ext.sql.SQLRowStream;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.sql.SQLConnection;
import io.vertx.php.ext.sql.SQLClient;
import io.vertx.php.ext.sql.SQLOperations;
@Name("MySQLClient")
@Namespace("io\\vertx\\php\\ext\\asyncsql")
public interface MySQLClient<S extends io.vertx.ext.asyncsql.MySQLClient> extends IWrapper<S>{

    @Signature
    default Memory querySingle(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingle(sql, handler)
    }

    @Signature
    default Memory querySingleWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingleWithParams(sql, arguments, handler)
    }

    @Signature
    default Memory getConnection(Environment __env__, Memory... args) {
        this.getWrappedObject().getConnection(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, handler)
    }

    @Signature
    default Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    default Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
    }

    @Signature
    default Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, arguments, handler)
    }

    @Signature
    default Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(sql, handler)
    }

    @Signature
    default Memory updateWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithParams(sql, params, handler)
    }

    @Signature
    default Memory call(Environment __env__, Memory... args) {
        this.getWrappedObject().call(sql, handler)
    }

    @Signature
    default Memory callWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().callWithParams(sql, params, outputs, handler)
    }

    @Signature
    static Memory createNonShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncSQLClientImpl::new, io.vertx.ext.asyncsql.MySQLClient.createNonShared(vertx, config)
    }

    @Signature
    static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncSQLClientImpl::new, io.vertx.ext.asyncsql.MySQLClient.createShared(vertx, config)
    }

}
