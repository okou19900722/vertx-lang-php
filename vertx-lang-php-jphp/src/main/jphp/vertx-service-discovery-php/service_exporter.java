/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.php.servicediscovery.spi;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
import io.vertx.php.servicediscovery.spi.ServicePublisher;

/**
 The service exporter allows integrate other discovery technologies with the Vert.x service discovery. It maps
 * @class
 */
@Name("ServiceExporter")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
public class ServiceExporter extends BaseWrapper<ServiceExporter>{

  /**
   Starts the exporter.

   @public
   @param vertx {Vertx} the vertx instance 
   @param publisher {ServicePublisher} the service discovery instance 
   @param configuration {Object} the bridge configuration if any 
   @param future {Future} a future on which the bridge must report the completion of the starting 
   */
  this.init = function(vertx, publisher, configuration, future) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'object' && __args[3]._jdel) {
      j_serviceExporter.init(vertx._jdel, publisher._jdel, utils.convParamJsonObject(configuration), future._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Notify a new record has been published, the record's registration can be used to uniquely
   identify the record

   @public
   @param record {Object} the record 
   */
  this.onPublish = function(record) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_serviceExporter.onPublish(record != null ? new Record(new JsonObject(Java.asJSONCompatible(record))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Notify an existing record has been updated, the record's registration can be used to uniquely
   identify the record

   @public
   @param record {Object} the record 
   */
  this.onUpdate = function(record) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_serviceExporter.onUpdate(record != null ? new Record(new JsonObject(Java.asJSONCompatible(record))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Notify an existing record has been removed

   @public
   @param id {string} the record registration id 
   */
  this.onUnpublish = function(id) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_serviceExporter.onUnpublish(id);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the exporter

   @public
   @param closeHandler {function} the handle to be notified when exporter is closed, may be <code>null</code> 
   */
  this.close = function(closeHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_serviceExporter.close(closeHandler);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_serviceExporter;
};

ServiceExporter._jclass = utils.getJavaClass("io.vertx.servicediscovery.spi.ServiceExporter");
ServiceExporter._jtype = {
  accept: function(obj) {
    return ServiceExporter._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ServiceExporter.prototype, {});
    ServiceExporter.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ServiceExporter._create = function(jdel) {
  var obj = Object.create(ServiceExporter.prototype, {});
  ServiceExporter.apply(obj, arguments);
  return obj;
}
module.exports = ServiceExporter;