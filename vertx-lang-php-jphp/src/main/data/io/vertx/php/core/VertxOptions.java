package io.vertx.php.core;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.dns.AddressResolverOptions;
import io.vertx.php.core.eventbus.EventBusOptions;
import io.vertx.php.core.metrics.MetricsOptions;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("VertxOptions")
@Namespace("io\\vertx\\php\\core")
//false
public  class VertxOptions extends DataObjectWrapper<io.vertx.core.VertxOptions> { 
    public VertxOptions(Environment env, io.vertx.core.VertxOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public VertxOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.VertxOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.VertxOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public AddressResolverOptions getAddressResolverOptions(){ 
        return new AddressResolverOptions(__env__, this.getWrappedObject().getAddressResolverOptions());
    }

    @Signature
    public VertxOptions setAddressResolverOptions(AddressResolverOptions addressResolverOptions){ 
        this.getWrappedObject().setAddressResolverOptions(addressResolverOptions.getWrappedObject());
        return this;
    }

    @Signature
    public long getBlockedThreadCheckInterval(){ 
        return this.getWrappedObject().getBlockedThreadCheckInterval();
    }

    @Signature
    public VertxOptions setBlockedThreadCheckInterval(long blockedThreadCheckInterval){ 
        this.getWrappedObject().setBlockedThreadCheckInterval(blockedThreadCheckInterval);
        return this;
    }

    @Signature
    public String getClusterHost(){ 
        return this.getWrappedObject().getClusterHost();
    }

    @Signature
    public VertxOptions setClusterHost(String clusterHost){ 
        this.getWrappedObject().setClusterHost(clusterHost);
        return this;
    }

    @Signature
    public long getClusterPingInterval(){ 
        return this.getWrappedObject().getClusterPingInterval();
    }

    @Signature
    public VertxOptions setClusterPingInterval(long clusterPingInterval){ 
        this.getWrappedObject().setClusterPingInterval(clusterPingInterval);
        return this;
    }

    @Signature
    public long getClusterPingReplyInterval(){ 
        return this.getWrappedObject().getClusterPingReplyInterval();
    }

    @Signature
    public VertxOptions setClusterPingReplyInterval(long clusterPingReplyInterval){ 
        this.getWrappedObject().setClusterPingReplyInterval(clusterPingReplyInterval);
        return this;
    }

    @Signature
    public int getClusterPort(){ 
        return this.getWrappedObject().getClusterPort();
    }

    @Signature
    public VertxOptions setClusterPort(int clusterPort){ 
        this.getWrappedObject().setClusterPort(clusterPort);
        return this;
    }

    @Signature
    public String getClusterPublicHost(){ 
        return this.getWrappedObject().getClusterPublicHost();
    }

    @Signature
    public VertxOptions setClusterPublicHost(String clusterPublicHost){ 
        this.getWrappedObject().setClusterPublicHost(clusterPublicHost);
        return this;
    }

    @Signature
    public int getClusterPublicPort(){ 
        return this.getWrappedObject().getClusterPublicPort();
    }

    @Signature
    public VertxOptions setClusterPublicPort(int clusterPublicPort){ 
        this.getWrappedObject().setClusterPublicPort(clusterPublicPort);
        return this;
    }

    @Signature
    public boolean isClustered(){ 
        return this.getWrappedObject().isClustered();
    }

    @Signature
    public VertxOptions setClustered(boolean clustered){ 
        this.getWrappedObject().setClustered(clustered);
        return this;
    }

    @Signature
    public EventBusOptions getEventBusOptions(){ 
        return new EventBusOptions(__env__, this.getWrappedObject().getEventBusOptions());
    }

    @Signature
    public VertxOptions setEventBusOptions(EventBusOptions eventBusOptions){ 
        this.getWrappedObject().setEventBusOptions(eventBusOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getEventLoopPoolSize(){ 
        return this.getWrappedObject().getEventLoopPoolSize();
    }

    @Signature
    public VertxOptions setEventLoopPoolSize(int eventLoopPoolSize){ 
        this.getWrappedObject().setEventLoopPoolSize(eventLoopPoolSize);
        return this;
    }

    @Signature
    public boolean isFileResolverCachingEnabled(){ 
        return this.getWrappedObject().isFileResolverCachingEnabled();
    }

    @Signature
    public VertxOptions setFileResolverCachingEnabled(boolean fileResolverCachingEnabled){ 
        this.getWrappedObject().setFileResolverCachingEnabled(fileResolverCachingEnabled);
        return this;
    }

    @Signature
    public boolean isHAEnabled(){ 
        return this.getWrappedObject().isHAEnabled();
    }

    @Signature
    public VertxOptions setHAEnabled(boolean haEnabled){ 
        this.getWrappedObject().setHAEnabled(haEnabled);
        return this;
    }

    @Signature
    public String getHAGroup(){ 
        return this.getWrappedObject().getHAGroup();
    }

    @Signature
    public VertxOptions setHAGroup(String haGroup){ 
        this.getWrappedObject().setHAGroup(haGroup);
        return this;
    }

    @Signature
    public int getInternalBlockingPoolSize(){ 
        return this.getWrappedObject().getInternalBlockingPoolSize();
    }

    @Signature
    public VertxOptions setInternalBlockingPoolSize(int internalBlockingPoolSize){ 
        this.getWrappedObject().setInternalBlockingPoolSize(internalBlockingPoolSize);
        return this;
    }

    @Signature
    public long getMaxEventLoopExecuteTime(){ 
        return this.getWrappedObject().getMaxEventLoopExecuteTime();
    }

    @Signature
    public VertxOptions setMaxEventLoopExecuteTime(long maxEventLoopExecuteTime){ 
        this.getWrappedObject().setMaxEventLoopExecuteTime(maxEventLoopExecuteTime);
        return this;
    }

    @Signature
    public long getMaxWorkerExecuteTime(){ 
        return this.getWrappedObject().getMaxWorkerExecuteTime();
    }

    @Signature
    public VertxOptions setMaxWorkerExecuteTime(long maxWorkerExecuteTime){ 
        this.getWrappedObject().setMaxWorkerExecuteTime(maxWorkerExecuteTime);
        return this;
    }

    @Signature
    public MetricsOptions getMetricsOptions(){ 
        return new MetricsOptions(__env__, this.getWrappedObject().getMetricsOptions());
    }

    @Signature
    public VertxOptions setMetricsOptions(MetricsOptions metricsOptions){ 
        this.getWrappedObject().setMetricsOptions(metricsOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getPreferNativeTransport(){ 
        return this.getWrappedObject().getPreferNativeTransport();
    }

    @Signature
    public VertxOptions setPreferNativeTransport(boolean preferNativeTransport){ 
        this.getWrappedObject().setPreferNativeTransport(preferNativeTransport);
        return this;
    }

    @Signature
    public int getQuorumSize(){ 
        return this.getWrappedObject().getQuorumSize();
    }

    @Signature
    public VertxOptions setQuorumSize(int quorumSize){ 
        this.getWrappedObject().setQuorumSize(quorumSize);
        return this;
    }

    @Signature
    public long getWarningExceptionTime(){ 
        return this.getWrappedObject().getWarningExceptionTime();
    }

    @Signature
    public VertxOptions setWarningExceptionTime(long warningExceptionTime){ 
        this.getWrappedObject().setWarningExceptionTime(warningExceptionTime);
        return this;
    }

    @Signature
    public int getWorkerPoolSize(){ 
        return this.getWrappedObject().getWorkerPoolSize();
    }

    @Signature
    public VertxOptions setWorkerPoolSize(int workerPoolSize){ 
        this.getWrappedObject().setWorkerPoolSize(workerPoolSize);
        return this;
    }
}
