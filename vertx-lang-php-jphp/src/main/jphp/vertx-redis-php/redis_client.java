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

package io.vertx.php.redis;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.redis.RedisTransaction;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.Vertx;
import io.vertx.php.redis.Script;

/**
 * @class
 */
@Name("RedisClient")
@Namespace("io\\vertx\\php\\redis")
public class RedisClient extends BaseWrapper<RedisClient>{

  /**
   Close the client - when it is fully closed the handler will be called.

   @public
   @param handler {function} 
   */
  this.close = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.close(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Append a value to a key

   @public
   @param key {string} Key string 
   @param value {string} Value to append 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.append = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.append(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Authenticate to the server

   @public
   @param password {string} Password for authentication 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.auth = function(password, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.auth(password, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Asynchronously rewrite the append-only file

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.bgrewriteaof = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.bgrewriteaof(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Asynchronously save the dataset to disk

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.bgsave = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.bgsave(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Count set bits in a string

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitcount = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.bitcount(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Count set bits in a string

   @public
   @param key {string} Key string 
   @param start {number} Start index 
   @param end {number} End index 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitcountRange = function(key, start, end, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.bitcountRange(key, start, end, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Perform bitwise operations between strings

   @public
   @param operation {Object} Bitwise operation to perform 
   @param destkey {string} Destination key where result is stored 
   @param keys {Array.<string>} List of keys on which to perform the operation 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitop = function(operation, destkey, keys, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_redisClient.bitop(io.vertx.redis.op.BitOperation.valueOf(operation), destkey, utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Find first bit set or clear in a string

   @public
   @param key {string} Key string 
   @param bit {number} What bit value to look for - must be 1, or 0 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitpos = function(key, bit, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.bitpos(key, bit, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Find first bit set or clear in a string
  
   See also bitposRange() method, which takes start, and stop offset.

   @public
   @param key {string} Key string 
   @param bit {number} What bit value to look for - must be 1, or 0 
   @param start {number} Start offset 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitposFrom = function(key, bit, start, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.bitposFrom(key, bit, start, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Find first bit set or clear in a string
  
   Note: when both start, and stop offsets are specified,
   behaviour is slightly different than if only start is specified

   @public
   @param key {string} Key string 
   @param bit {number} What bit value to look for - must be 1, or 0 
   @param start {number} Start offset 
   @param stop {number} End offset - inclusive 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.bitposRange = function(key, bit, start, stop, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] ==='number' && typeof __args[4] === 'function') {
      j_redisClient.bitposRange(key, bit, start, stop, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the first element in a list, or block until one is available

   @public
   @param key {string} Key string identifying a list to watch 
   @param seconds {number} Timeout in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.blpop = function(key, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.blpop(key, seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the first element in any of the lists, or block until one is available

   @public
   @param keys {Array.<string>} List of key strings identifying lists to watch 
   @param seconds {number} Timeout in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.blpopMany = function(keys, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.blpopMany(utils.convParamListBasicOther(keys), seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the last element in a list, or block until one is available

   @public
   @param key {string} Key string identifying a list to watch 
   @param seconds {number} Timeout in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.brpop = function(key, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.brpop(key, seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the last element in any of the lists, or block until one is available

   @public
   @param keys {Array.<string>} List of key strings identifying lists to watch 
   @param seconds {number} Timeout in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.brpopMany = function(keys, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.brpopMany(utils.convParamListBasicOther(keys), seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Pop a value from a list, push it to another list and return it; or block until one is available

   @public
   @param key {string} Key string identifying the source list 
   @param destkey {string} Key string identifying the destination list 
   @param seconds {number} Timeout in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.brpoplpush = function(key, destkey, seconds, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.brpoplpush(key, destkey, seconds, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Kill the connection of a client

   @public
   @param filter {Object} Filter options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clientKill = function(filter, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_redisClient.clientKill(filter != null ? new KillFilter(new JsonObject(Java.asJSONCompatible(filter))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the list of client connections

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.clientList = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clientList(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the current connection name

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.clientGetname = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clientGetname(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Stop processing commands from clients for some time

   @public
   @param millis {number} Pause time in milliseconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clientPause = function(millis, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.clientPause(millis, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the current connection name

   @public
   @param name {string} New name for current connection 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clientSetname = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clientSetname(name, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Assign new hash slots to receiving node.

   @public
   @param slots {Array.<number>} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterAddslots = function(slots, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.clusterAddslots(utils.convParamListLong(slots), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the number of failure reports active for a given node.

   @public
   @param nodeId {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterCountFailureReports = function(nodeId, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterCountFailureReports(nodeId, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the number of local keys in the specified hash slot.

   @public
   @param slot {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterCountkeysinslot = function(slot, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.clusterCountkeysinslot(slot, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set hash slots as unbound in receiving node.

   @public
   @param slot {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterDelslots = function(slot, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.clusterDelslots(slot, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set hash slots as unbound in receiving node.

   @public
   @param slots {Array.<number>} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterDelslotsMany = function(slots, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.clusterDelslotsMany(utils.convParamListLong(slots), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Forces a slave to perform a manual failover of its master.

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterFailover = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterFailover(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Forces a slave to perform a manual failover of its master.

   @public
   @param options {Object} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterFailOverWithOptions = function(options, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterFailOverWithOptions(io.vertx.redis.op.FailoverOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove a node from the nodes table.

   @public
   @param nodeId {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterForget = function(nodeId, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterForget(nodeId, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return local key names in the specified hash slot.

   @public
   @param slot {number} 
   @param count {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterGetkeysinslot = function(slot, count, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.clusterGetkeysinslot(slot, count, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Provides info about Redis Cluster node state.

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterInfo = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterInfo(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the hash slot of the specified key.

   @public
   @param key {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterKeyslot = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterKeyslot(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Force a node cluster to handshake with another node.

   @public
   @param ip {string} 
   @param port {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterMeet = function(ip, port, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.clusterMeet(ip, port, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get Cluster config for the node.

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterNodes = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterNodes(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reconfigure a node as a slave of the specified master node.

   @public
   @param nodeId {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterReplicate = function(nodeId, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterReplicate(nodeId, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reset a Redis Cluster node.

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterReset = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterReset(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reset a Redis Cluster node.

   @public
   @param options {Object} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterResetWithOptions = function(options, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterResetWithOptions(io.vertx.redis.op.ResetOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Forces the node to save cluster state on disk.

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterSaveconfig = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterSaveconfig(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the configuration epoch in a new node.

   @public
   @param epoch {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterSetConfigEpoch = function(epoch, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.clusterSetConfigEpoch(epoch, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Bind an hash slot to a specific node.

   @public
   @param slot {number} 
   @param subcommand {Object} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterSetslot = function(slot, subcommand, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.clusterSetslot(slot, io.vertx.redis.op.SlotCmd.valueOf(subcommand), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Bind an hash slot to a specific node.

   @public
   @param slot {number} 
   @param subcommand {Object} 
   @param nodeId {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterSetslotWithNode = function(slot, subcommand, nodeId, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.clusterSetslotWithNode(slot, io.vertx.redis.op.SlotCmd.valueOf(subcommand), nodeId, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   List slave nodes of the specified master node.

   @public
   @param nodeId {string} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.clusterSlaves = function(nodeId, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clusterSlaves(nodeId, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get array of Cluster slot to node mappings

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.clusterSlots = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.clusterSlots(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get array of Redis command details

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.command = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.command(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get total number of Redis commands

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.commandCount = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.commandCount(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Extract keys given a full Redis command

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.commandGetkeys = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.commandGetkeys(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get array of specific Redis command details

   @public
   @param commands {Array.<string>} List of commands to get info for 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.commandInfo = function(commands, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.commandInfo(utils.convParamListBasicOther(commands), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the value of a configuration parameter

   @public
   @param parameter {string} Configuration parameter 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.configGet = function(parameter, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.configGet(parameter, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Rewrite the configuration file with the in memory configuration

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.configRewrite = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.configRewrite(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a configuration parameter to the given value

   @public
   @param parameter {string} Configuration parameter 
   @param value {string} New value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.configSet = function(parameter, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.configSet(parameter, value, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reset the stats returned by INFO

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.configResetstat = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.configResetstat(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the number of keys in the selected database

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.dbsize = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.dbsize(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get debugging information about a key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.debugObject = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.debugObject(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Make the server crash

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.debugSegfault = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.debugSegfault(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Decrement the integer value of a key by one

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.decr = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.decr(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Decrement the integer value of a key by the given number

   @public
   @param key {string} Key string 
   @param decrement {number} Value by which to decrement 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.decrby = function(key, decrement, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.decrby(key, decrement, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a key

   @public
   @param key {string} Keys to delete 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.del = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.del(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete many keys

   @public
   @param keys {Array.<string>} List of keys to delete 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.delMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.delMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a serialized version of the value stored at the specified key.

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.dump = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.dump(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Echo the given string

   @public
   @param message {string} String to echo 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.echo = function(message, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.echo(message, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
   for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
  
   When a reply if for example a String the handler will be called with a JsonArray with a single element containing
   the String.

   @public
   @param script {string} Lua script to evaluate 
   @param keys {Array.<string>} List of keys 
   @param args {Array.<string>} List of argument values 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.eval = function(script, keys, args, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_redisClient.eval(script, utils.convParamListBasicOther(keys), utils.convParamListBasicOther(args), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
   for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
  
   When a reply if for example a String the handler will be called with a JsonArray with a single element containing
   the String.

   @public
   @param sha1 {string} SHA1 digest of the script cached on the server 
   @param keys {Array.<string>} List of keys 
   @param values {Array.<string>} List of values 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.evalsha = function(sha1, keys, values, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_redisClient.evalsha(sha1, utils.convParamListBasicOther(keys), utils.convParamListBasicOther(values), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a Lua script server side. This method is a high level wrapper around EVAL and EVALSHA
   using the latter if possible, falling back to EVAL if the script is not cached by the server yet.
   According to Redis documentation, executed scripts are guaranteed to be in the script cache of a
   given execution of a Redis instance forever, which means typically the overhead incurred by
   optimistically sending EVALSHA is minimal, while improving performance and saving bandwidth
   compared to using EVAL every time.

   @public
   @param script {Script} Lua script and its SHA1 digest 
   @param keys {Array.<string>} List of keys 
   @param args {Array.<string>} List of argument values 
   @param handler {function} Handler for the result of this call. group: scripting 
   @return {RedisClient}
   */
  this.evalScript = function(script, keys, args, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_redisClient.evalScript(script._jdel, utils.convParamListBasicOther(keys), utils.convParamListBasicOther(args), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine if a key exists

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.exists = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.exists(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine if one or many keys exist

   @public
   @param keys {Array.<string>} List of key strings 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.existsMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.existsMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a key's time to live in seconds

   @public
   @param key {string} Key string 
   @param seconds {number} Time to live in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.expire = function(key, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.expire(key, seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the expiration for a key as a UNIX timestamp

   @public
   @param key {string} Key string 
   @param seconds {number} Expiry time as Unix timestamp in seconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.expireat = function(key, seconds, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.expireat(key, seconds, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all keys from all databases

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.flushall = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.flushall(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all keys from the current database

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.flushdb = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.flushdb(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the value of a key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.get = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.get(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the value of a key - without decoding as utf-8

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.getBinary = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.getBinary(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(Buffer, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the bit value at offset in the string value stored at key

   @public
   @param key {string} Key string 
   @param offset {number} Offset in bits 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.getbit = function(key, offset, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.getbit(key, offset, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get a substring of the string stored at a key

   @public
   @param key {string} Key string 
   @param start {number} Start offset 
   @param end {number} End offset - inclusive 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.getrange = function(key, start, end, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.getrange(key, start, end, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the string value of a key and return its old value

   @public
   @param key {string} Key of which value to set 
   @param value {string} New value for the key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.getset = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.getset(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete one or more hash fields

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hdel = function(key, field, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.hdel(key, field, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete one or more hash fields

   @public
   @param key {string} Key string 
   @param fields {Array.<string>} Field names 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hdelMany = function(key, fields, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.hdelMany(key, utils.convParamListBasicOther(fields), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine if a hash field exists

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hexists = function(key, field, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.hexists(key, field, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the value of a hash field

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hget = function(key, field, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.hget(key, field, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get all the fields and values in a hash

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hgetall = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.hgetall(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the integer value of a hash field by the given number

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param increment {number} Value by which to increment 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hincrby = function(key, field, increment, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.hincrby(key, field, increment, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the float value of a hash field by the given amount

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param increment {number} Value by which to increment 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hincrbyfloat = function(key, field, increment, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.hincrbyfloat(key, field, increment, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get all the fields in a hash

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hkeys = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.hkeys(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the number of fields in a hash

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hlen = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.hlen(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the values of all the given hash fields

   @public
   @param key {string} Key string 
   @param fields {Array.<string>} Field names 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hmget = function(key, fields, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.hmget(key, utils.convParamListBasicOther(fields), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set multiple hash fields to multiple values

   @public
   @param key {string} Key string 
   @param values {Object} Map of field:value pairs 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hmset = function(key, values, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_redisClient.hmset(key, utils.convParamJsonObject(values), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the string value of a hash field

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param value {string} New value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hset = function(key, field, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.hset(key, field, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the value of a hash field, only if the field does not exist

   @public
   @param key {string} Key string 
   @param field {string} Field name 
   @param value {string} New value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hsetnx = function(key, field, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.hsetnx(key, field, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get all the values in a hash

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hvals = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.hvals(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the integer value of a key by one

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.incr = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.incr(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the integer value of a key by the given amount

   @public
   @param key {string} Key string 
   @param increment {number} Value by which to increment 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.incrby = function(key, increment, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.incrby(key, increment, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the float value of a key by the given amount

   @public
   @param key {string} Key string 
   @param increment {number} Value by which to increment 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.incrbyfloat = function(key, increment, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.incrbyfloat(key, increment, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get information and statistics about the server

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.info = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.info(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get information and statistics about the server

   @public
   @param section {string} Specific section of information to return 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.infoSection = function(section, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.infoSection(section, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Find all keys matching the given pattern

   @public
   @param pattern {string} Pattern to limit the keys returned 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.keys = function(pattern, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.keys(pattern, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the UNIX time stamp of the last successful save to disk

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.lastsave = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.lastsave(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get an element from a list by its index

   @public
   @param key {string} Key string 
   @param index {number} Index of list element to get 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lindex = function(key, index, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.lindex(key, index, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Insert an element before or after another element in a list

   @public
   @param key {string} Key string 
   @param option {Object} BEFORE or AFTER 
   @param pivot {string} Key to use as a pivot 
   @param value {string} Value to be inserted before or after the pivot 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.linsert = function(key, option, pivot, value, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.linsert(key, io.vertx.redis.op.InsertOptions.valueOf(option), pivot, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the length of a list

   @public
   @param key {string} String key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.llen = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.llen(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the first element in a list

   @public
   @param key {string} String key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lpop = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.lpop(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Prepend one or multiple values to a list

   @public
   @param key {string} Key string 
   @param values {Array.<string>} Values to be added at the beginning of the list, one by one 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lpushMany = function(key, values, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.lpushMany(key, utils.convParamListBasicOther(values), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Prepend one value to a list

   @public
   @param key {string} Key string 
   @param value {string} Value to be added at the beginning of the list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lpush = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.lpush(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Prepend a value to a list, only if the list exists

   @public
   @param key {string} Key string 
   @param value {string} Value to add at the beginning of the list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lpushx = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.lpushx(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get a range of elements from a list

   @public
   @param key {string} Key string 
   @param from {number} Start index 
   @param to {number} Stop index 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lrange = function(key, from, to, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.lrange(key, from, to, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove elements from a list

   @public
   @param key {string} Key string 
   @param count {number} Number of first found occurrences equal to $value to remove from the list 
   @param value {string} Value to be removed 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lrem = function(key, count, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.lrem(key, count, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the value of an element in a list by its index

   @public
   @param key {string} Key string 
   @param index {number} Position within list 
   @param value {string} New value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.lset = function(key, index, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.lset(key, index, value, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Trim a list to the specified range

   @public
   @param key {string} Key string 
   @param from {number} Start index 
   @param to {number} Stop index 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.ltrim = function(key, from, to, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.ltrim(key, from, to, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the value of the given key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.mget = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.mget(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the values of all the given keys

   @public
   @param keys {Array.<string>} List of keys to get 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.mgetMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.mgetMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Atomically transfer a key from a Redis instance to another one.

   @public
   @param host {string} Destination host 
   @param port {number} Destination port 
   @param key {string} Key to migrate 
   @param destdb {number} Destination database index 
   @param timeout {number} 
   @param options {Object} Migrate options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.migrate = function(host, port, key, destdb, timeout, options, handler) {
    var __args = arguments;
    if (__args.length === 7 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] ==='number' && typeof __args[4] ==='number' && (typeof __args[5] === 'object' && __args[5] != null) && typeof __args[6] === 'function') {
      j_redisClient.migrate(host, port, key, destdb, timeout, options != null ? new MigrateOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Listen for all requests received by the server in real time

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.monitor = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.monitor(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Move a key to another database

   @public
   @param key {string} Key to migrate 
   @param destdb {number} Destination database index 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.move = function(key, destdb, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.move(key, destdb, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set multiple keys to multiple values

   @public
   @param keyvals {Object} Key value pairs to set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.mset = function(keyvals, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_redisClient.mset(utils.convParamJsonObject(keyvals), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set multiple keys to multiple values, only if none of the keys exist

   @public
   @param keyvals {Object} Key value pairs to set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.msetnx = function(keyvals, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_redisClient.msetnx(utils.convParamJsonObject(keyvals), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Inspect the internals of Redis objects

   @public
   @param key {string} Key string 
   @param cmd {Object} Object sub command 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.object = function(key, cmd, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.object(key, io.vertx.redis.op.ObjectCmd.valueOf(cmd), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove the expiration from a key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.persist = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.persist(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a key's time to live in milliseconds

   @public
   @param key {string} String key 
   @param millis {number} Time to live in milliseconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pexpire = function(key, millis, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.pexpire(key, millis, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the expiration for a key as a UNIX timestamp specified in milliseconds

   @public
   @param key {string} Key string 
   @param millis {number} Expiry time as Unix timestamp in milliseconds 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pexpireat = function(key, millis, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.pexpireat(key, millis, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Adds the specified element to the specified HyperLogLog.

   @public
   @param key {string} Key string 
   @param element {string} Element to add 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pfadd = function(key, element, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.pfadd(key, element, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Adds the specified elements to the specified HyperLogLog.

   @public
   @param key {string} Key string 
   @param elements {Array.<string>} Elementa to add 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pfaddMany = function(key, elements, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.pfaddMany(key, utils.convParamListBasicOther(elements), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the approximated cardinality of the set observed by the HyperLogLog at key.

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pfcount = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.pfcount(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).

   @public
   @param keys {Array.<string>} List of keys 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pfcountMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.pfcountMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Merge N different HyperLogLogs into a single one.

   @public
   @param destkey {string} Destination key 
   @param keys {Array.<string>} List of source keys 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pfmerge = function(destkey, keys, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.pfmerge(destkey, utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Ping the server

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.ping = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.ping(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the value and expiration in milliseconds of a key

   @public
   @param key {string} Key string 
   @param millis {number} Number of milliseconds until the key expires 
   @param value {string} New value for key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.psetex = function(key, millis, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.psetex(key, millis, value, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Listen for messages published to channels matching the given pattern

   @public
   @param pattern {string} Pattern string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.psubscribe = function(pattern, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.psubscribe(pattern, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Listen for messages published to channels matching the given patterns

   @public
   @param patterns {Array.<string>} List of patterns 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.psubscribeMany = function(patterns, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.psubscribeMany(utils.convParamListBasicOther(patterns), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Lists the currently active channels - only those matching the pattern

   @public
   @param pattern {string} A glob-style pattern - an empty string means no pattern 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pubsubChannels = function(pattern, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.pubsubChannels(pattern, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the number of subscribers (not counting clients subscribed to patterns) for the specified channels

   @public
   @param channels {Array.<string>} List of channels 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pubsubNumsub = function(channels, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.pubsubNumsub(utils.convParamListBasicOther(channels), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the number of subscriptions to patterns (that are performed using the PSUBSCRIBE command)

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pubsubNumpat = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.pubsubNumpat(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the time to live for a key in milliseconds

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.pttl = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.pttl(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Post a message to a channel

   @public
   @param channel {string} Channel key 
   @param message {string} Message to send to channel 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.publish = function(channel, message, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.publish(channel, message, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Stop listening for messages posted to channels matching the given patterns

   @public
   @param patterns {Array.<string>} List of patterns to match against 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.punsubscribe = function(patterns, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.punsubscribe(utils.convParamListBasicOther(patterns), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a random key from the keyspace

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.randomkey = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.randomkey(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Rename a key

   @public
   @param key {string} Key string to be renamed 
   @param newkey {string} New key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rename = function(key, newkey, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.rename(key, newkey, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Rename a key, only if the new key does not exist

   @public
   @param key {string} Key string to be renamed 
   @param newkey {string} New key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.renamenx = function(key, newkey, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.renamenx(key, newkey, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create a key using the provided serialized value, previously obtained using DUMP.

   @public
   @param key {string} Key string 
   @param millis {number} Expiry time in milliseconds to set on the key 
   @param serialized {string} Serialized form of the key value as obtained using DUMP 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.restore = function(key, millis, serialized, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.restore(key, millis, serialized, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the role of the instance in the context of replication

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.role = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.role(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and get the last element in a list

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rpop = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.rpop(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove the last element in a list, append it to another list and return it

   @public
   @param key {string} Key string identifying source list 
   @param destkey {string} Key string identifying destination list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rpoplpush = function(key, destkey, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.rpoplpush(key, destkey, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Append one or multiple values to a list

   @public
   @param key {string} Key string 
   @param values {Array.<string>} List of values to add to the end of the list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rpushMany = function(key, values, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.rpushMany(key, utils.convParamListBasicOther(values), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Append one or multiple values to a list

   @public
   @param key {string} Key string 
   @param value {string} Value to be added to the end of the list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rpush = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.rpush(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Append a value to a list, only if the list exists

   @public
   @param key {string} Key string 
   @param value {string} Value to be added to the end of the list 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.rpushx = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.rpushx(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a member to a set

   @public
   @param key {string} Key string 
   @param member {string} Value to be added to the set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sadd = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.sadd(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add one or more members to a set

   @public
   @param key {string} Key string 
   @param members {Array.<string>} Values to be added to the set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.saddMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.saddMany(key, utils.convParamListBasicOther(members), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Synchronously save the dataset to disk

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.save = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.save(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the number of members in a set

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.scard = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.scard(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Check existence of script in the script cache.

   @public
   @param script {string} SHA1 digest identifying a script in the script cache 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.scriptExists = function(script, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.scriptExists(script, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Check existence of scripts in the script cache.

   @public
   @param scripts {Array.<string>} List of SHA1 digests identifying scripts in the script cache 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.scriptExistsMany = function(scripts, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.scriptExistsMany(utils.convParamListBasicOther(scripts), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all the scripts from the script cache.

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.scriptFlush = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.scriptFlush(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Kill the script currently in execution.

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.scriptKill = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.scriptKill(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Load the specified Lua script into the script cache.

   @public
   @param script {string} Lua script 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.scriptLoad = function(script, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.scriptLoad(script, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Subtract multiple sets

   @public
   @param key {string} Key identifying the set to compare with all other sets combined 
   @param cmpkeys {Array.<string>} List of keys identifying sets to subtract from the key set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sdiff = function(key, cmpkeys, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.sdiff(key, utils.convParamListBasicOther(cmpkeys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Subtract multiple sets and store the resulting set in a key

   @public
   @param destkey {string} Destination key where the result should be stored 
   @param key {string} Key identifying the set to compare with all other sets combined 
   @param cmpkeys {Array.<string>} List of keys identifying sets to subtract from the key set 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sdiffstore = function(destkey, key, cmpkeys, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_redisClient.sdiffstore(destkey, key, utils.convParamListBasicOther(cmpkeys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Change the selected database for the current connection

   @public
   @param dbindex {number} Index identifying the new active database 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.select = function(dbindex, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.select(dbindex, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the string value of a key

   @public
   @param key {string} Key of which value to set 
   @param value {string} New value for the key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.set = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.set(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the string value of a key

   @public
   @param key {string} Key of which value to set 
   @param value {string} New value for the key 
   @param options {Object} Set options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setWithOptions = function(key, value, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_redisClient.setWithOptions(key, value, options != null ? new SetOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the binary string value of a key - without encoding as utf-8

   @public
   @param key {string} Key of which value to set 
   @param value {Buffer} New value for the key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setBinary = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'function') {
      j_redisClient.setBinary(key, value._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the string value of a key

   @public
   @param key {string} Key of which value to set 
   @param value {Buffer} New value for the key 
   @param options {Object} Set options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setBinaryWithOptions = function(key, value, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_redisClient.setBinaryWithOptions(key, value._jdel, options != null ? new SetOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets or clears the bit at offset in the string value stored at key

   @public
   @param key {string} Key string 
   @param offset {number} Bit offset 
   @param bit {number} New value - must be 1 or 0 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setbit = function(key, offset, bit, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.setbit(key, offset, bit, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the value and expiration of a key

   @public
   @param key {string} Key string 
   @param seconds {number} Number of seconds until the key expires 
   @param value {string} New value for key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setex = function(key, seconds, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.setex(key, seconds, value, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the value of a key, only if the key does not exist

   @public
   @param key {string} Key of which value to set 
   @param value {string} New value for the key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setnx = function(key, value, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.setnx(key, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Overwrite part of a string at key starting at the specified offset

   @public
   @param key {string} Key string 
   @param offset {number} Offset - the maximum offset that you can set is 2^29 -1 (536870911), as Redis Strings are limited to 512 megabytes 
   @param value {string} Value to overwrite with 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.setrange = function(key, offset, value, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.setrange(key, offset, value, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Intersect multiple sets

   @public
   @param keys {Array.<string>} List of keys to perform intersection on 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sinter = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.sinter(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Intersect multiple sets and store the resulting set in a key

   @public
   @param destkey {string} Key where to store the results 
   @param keys {Array.<string>} List of keys to perform intersection on 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sinterstore = function(destkey, keys, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.sinterstore(destkey, utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine if a given value is a member of a set

   @public
   @param key {string} Key string 
   @param member {string} Member to look for 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sismember = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.sismember(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Make the server a slave of another instance

   @public
   @param host {string} Host to become this server's master 
   @param port {number} Port of our new master 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.slaveof = function(host, port, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.slaveof(host, port, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Make this server a master

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.slaveofNoone = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.slaveofNoone(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Read the Redis slow queries log

   @public
   @param limit {number} Number of log entries to return. If value is less than zero all entries are returned 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.slowlogGet = function(limit, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_redisClient.slowlogGet(limit, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the length of the Redis slow queries log

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.slowlogLen = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.slowlogLen(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reset the Redis slow queries log

   @public
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.slowlogReset = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.slowlogReset(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get all the members in a set

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.smembers = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.smembers(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Move a member from one set to another

   @public
   @param key {string} Key of source set currently containing the member 
   @param destkey {string} Key identifying the destination set 
   @param member {string} Member to move 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.smove = function(key, destkey, member, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.smove(key, destkey, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sort the elements in a list, set or sorted set

   @public
   @param key {string} Key string 
   @param options {Object} Sort options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sort = function(key, options, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_redisClient.sort(key, options != null ? new SortOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and return a random member from a set

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.spop = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.spop(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove and return random members from a set

   @public
   @param key {string} Key string 
   @param count {number} Number of members to remove 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.spopMany = function(key, count, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.spopMany(key, count, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get one or multiple random members from a set

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.srandmember = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.srandmember(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get one or multiple random members from a set

   @public
   @param key {string} Key string 
   @param count {number} Number of members to get 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.srandmemberCount = function(key, count, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.srandmemberCount(key, count, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove one member from a set

   @public
   @param key {string} Key string 
   @param member {string} Member to remove 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.srem = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.srem(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove one or more members from a set

   @public
   @param key {string} Key string 
   @param members {Array.<string>} Members to remove 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sremMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.sremMany(key, utils.convParamListBasicOther(members), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the length of the value stored in a key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.strlen = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.strlen(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Listen for messages published to the given channels

   @public
   @param channel {string} Channel to subscribe to 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.subscribe = function(channel, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.subscribe(channel, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Listen for messages published to the given channels

   @public
   @param channels {Array.<string>} List of channels to subscribe to 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.subscribeMany = function(channels, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.subscribeMany(utils.convParamListBasicOther(channels), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add multiple sets

   @public
   @param keys {Array.<string>} List of keys identifying sets to add up 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sunion = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.sunion(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add multiple sets and store the resulting set in a key

   @public
   @param destkey {string} Destination key 
   @param keys {Array.<string>} List of keys identifying sets to add up 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sunionstore = function(destkey, keys, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.sunionstore(destkey, utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Internal command used for replication

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.sync = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.sync(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the current server time

   @public
   @param handler {function} 
   @return {RedisClient}
   */
  this.time = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisClient.time(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a RedisTransaction instance

   @public

   @return {RedisTransaction} transaction instance
   */
  this.transaction = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(RedisTransaction, j_redisClient.transaction());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the time to live for a key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.ttl = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.ttl(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine the type stored at key

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.type = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.type(key, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Stop listening for messages posted to the given channels

   @public
   @param channels {Array.<string>} List of channels to subscribe to 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.unsubscribe = function(channels, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.unsubscribe(utils.convParamListBasicOther(channels), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Wait for the synchronous replication of all the write commands sent in the context of the current connection.

   @public
   @param numSlaves {number} 
   @param timeout {number} 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.wait = function(numSlaves, timeout, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.wait(numSlaves, timeout, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add one or more members to a sorted set, or update its score if it already exists

   @public
   @param key {string} Key string 
   @param score {number} Score used for sorting 
   @param member {string} New member key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zadd = function(key, score, member, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zadd(key, score, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add one or more members to a sorted set, or update its score if it already exists

   @public
   @param key {string} Key string 
   @param members {Array.<string>} New member keys and their scores 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zaddMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_redisClient.zaddMany(key, members, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the number of members in a sorted set

   @public
   @param key {string} Key string 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zcard = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.zcard(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Count the members in a sorted set with scores within the given values

   @public
   @param key {string} Key string 
   @param min {number} Minimum score 
   @param max {number} Maximum score 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zcount = function(key, min, max, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.zcount(key, min, max, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Increment the score of a member in a sorted set

   @public
   @param key {string} Key string 
   @param increment {number} Increment amount 
   @param member {string} Member key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zincrby = function(key, increment, member, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zincrby(key, increment, member, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Intersect multiple sorted sets and store the resulting sorted set in a new key

   @public
   @param destkey {string} Destination key 
   @param sets {Array.<string>} List of keys identifying sorted sets to intersect 
   @param options {Object} Aggregation options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zinterstore = function(destkey, sets, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zinterstore(destkey, utils.convParamListBasicOther(sets), io.vertx.redis.op.AggregateOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Intersect multiple sorted sets and store the resulting sorted set in a new key using weights for scoring

   @public
   @param destkey {string} Destination key 
   @param sets {Array.<string>} List of keys identifying sorted sets to intersect 
   @param options {Object} Aggregation options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zinterstoreWeighed = function(destkey, sets, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zinterstoreWeighed(destkey, sets, io.vertx.redis.op.AggregateOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Count the number of members in a sorted set between a given lexicographical range

   @public
   @param key {string} Key string 
   @param min {string} Pattern to compare against for minimum value 
   @param max {string} Pattern to compare against for maximum value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zlexcount = function(key, min, max, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zlexcount(key, min, max, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by index

   @public
   @param key {string} Key string 
   @param start {number} Start index for the range 
   @param stop {number} Stop index for the range - inclusive 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrange = function(key, start, stop, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.zrange(key, start, stop, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by index

   @public
   @param key {string} Key string 
   @param start {number} Start index for the range 
   @param stop {number} Stop index for the range - inclusive 
   @param options {Object} Range options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrangeWithOptions = function(key, start, stop, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.zrangeWithOptions(key, start, stop, io.vertx.redis.op.RangeOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by lexicographical range

   @public
   @param key {string} Key string 
   @param min {string} Pattern representing a minimum allowed value 
   @param max {string} Pattern representing a maximum allowed value 
   @param options {Object} Limit options where limit can be specified 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrangebylex = function(key, min, max, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_redisClient.zrangebylex(key, min, max, options != null ? new LimitOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by score

   @public
   @param key {string} Key string 
   @param min {string} Pattern defining a minimum value 
   @param max {string} Pattern defining a maximum value 
   @param options {Object} Range and limit options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrangebyscore = function(key, min, max, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_redisClient.zrangebyscore(key, min, max, options != null ? new RangeLimitOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine the index of a member in a sorted set

   @public
   @param key {string} Key string 
   @param member {string} Member in the sorted set identified by key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrank = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.zrank(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove one member from a sorted set

   @public
   @param key {string} Key string 
   @param member {string} Member in the sorted set identified by key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrem = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.zrem(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove one or more members from a sorted set

   @public
   @param key {string} Key string 
   @param members {Array.<string>} Members in the sorted set identified by key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zremMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.zremMany(key, utils.convParamListBasicOther(members), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all members in a sorted set between the given lexicographical range

   @public
   @param key {string} Key string 
   @param min {string} Pattern defining a minimum value 
   @param max {string} Pattern defining a maximum value 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zremrangebylex = function(key, min, max, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zremrangebylex(key, min, max, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all members in a sorted set within the given indexes

   @public
   @param key {string} Key string 
   @param start {number} Start index 
   @param stop {number} Stop index 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zremrangebyrank = function(key, start, stop, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_redisClient.zremrangebyrank(key, start, stop, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all members in a sorted set within the given scores

   @public
   @param key {string} Key string 
   @param min {string} Pattern defining a minimum value 
   @param max {string} Pattern defining a maximum value 
   @param handler {function} 
   @return {RedisClient}
   */
  this.zremrangebyscore = function(key, min, max, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zremrangebyscore(key, min, max, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by index, with scores ordered from high to low

   @public
   @param key {string} Key string 
   @param start {number} Start index for the range 
   @param stop {number} Stop index for the range - inclusive 
   @param options {Object} Range options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrevrange = function(key, start, stop, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.zrevrange(key, start, stop, io.vertx.redis.op.RangeOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by score, between the given lexicographical range with scores ordered from high to low

   @public
   @param key {string} Key string 
   @param max {string} Pattern defining a maximum value 
   @param min {string} Pattern defining a minimum value 
   @param options {Object} Limit options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrevrangebylex = function(key, max, min, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_redisClient.zrevrangebylex(key, max, min, options != null ? new LimitOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a range of members in a sorted set, by score, with scores ordered from high to low

   @public
   @param key {string} Key string 
   @param max {string} Pattern defining a maximum value 
   @param min {string} Pattern defining a minimum value 
   @param options {Object} Range and limit options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrevrangebyscore = function(key, max, min, options, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_redisClient.zrevrangebyscore(key, max, min, options != null ? new RangeLimitOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Determine the index of a member in a sorted set, with scores ordered from high to low

   @public
   @param key {string} Key string 
   @param member {string} Member in the sorted set identified by key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zrevrank = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.zrevrank(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the score associated with the given member in a sorted set

   @public
   @param key {string} Key string 
   @param member {string} Member in the sorted set identified by key 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zscore = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.zscore(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add multiple sorted sets and store the resulting sorted set in a new key

   @public
   @param destkey {string} Destination key 
   @param sets {Array.<string>} List of keys identifying sorted sets 
   @param options {Object} Aggregation options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zunionstore = function(destkey, sets, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zunionstore(destkey, utils.convParamListBasicOther(sets), io.vertx.redis.op.AggregateOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add multiple sorted sets using weights, and store the resulting sorted set in a new key

   @public
   @param key {string} Destination key 
   @param sets {Array.<string>} Map containing set-key:weight pairs 
   @param options {Object} Aggregation options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zunionstoreWeighed = function(key, sets, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.zunionstoreWeighed(key, sets, io.vertx.redis.op.AggregateOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Incrementally iterate the keys space

   @public
   @param cursor {string} Cursor id 
   @param options {Object} Scan options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.scan = function(cursor, options, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_redisClient.scan(cursor, options != null ? new ScanOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Incrementally iterate Set elements

   @public
   @param key {string} Key string 
   @param cursor {string} Cursor id 
   @param options {Object} Scan options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.sscan = function(key, cursor, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_redisClient.sscan(key, cursor, options != null ? new ScanOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Incrementally iterate hash fields and associated values

   @public
   @param key {string} Key string 
   @param cursor {string} Cursor id 
   @param options {Object} Scan options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.hscan = function(key, cursor, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_redisClient.hscan(key, cursor, options != null ? new ScanOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Incrementally iterate sorted sets elements and associated scores

   @public
   @param key {string} Key string 
   @param cursor {string} Cursor id 
   @param options {Object} Scan options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.zscan = function(key, cursor, options, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_redisClient.zscan(key, cursor, options != null ? new ScanOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add one or more geospatial items in the geospatial index represented using a sorted set.

   @public
   @param key {string} Key string 
   @param longitude {number} longitude 
   @param latitude {number} latitude 
   @param member {string} member 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geoadd = function(key, longitude, latitude, member, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.geoadd(key, longitude, latitude, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add one or more geospatial items in the geospatial index represented using a sorted set.

   @public
   @param key {string} Key string 
   @param members {Array.<Object>} list of &lt;lon, lat, member&gt; 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geoaddMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.geoaddMany(key, utils.convParamListDataObject(members, function(json) { return new GeoMember(json); }), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
   a geospatial index (where elements were added using GEOADD).

   @public
   @param key {string} Key string 
   @param member {string} member 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geohash = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.geohash(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
   a geospatial index (where elements were added using GEOADD).

   @public
   @param key {string} Key string 
   @param members {Array.<string>} list of members 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geohashMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.geohashMany(key, utils.convParamListBasicOther(members), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
   sorted set at key.

   @public
   @param key {string} Key string 
   @param member {string} member 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geopos = function(key, member, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.geopos(key, member, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
   sorted set at key.

   @public
   @param key {string} Key string 
   @param members {Array.<string>} list of members 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geoposMany = function(key, members, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_redisClient.geoposMany(key, utils.convParamListBasicOther(members), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the distance between two members in the geospatial index represented by the sorted set.

   @public
   @param key {string} Key string 
   @param member1 {string} member 1 
   @param member2 {string} member 2 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geodist = function(key, member1, member2, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.geodist(key, member1, member2, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the distance between two members in the geospatial index represented by the sorted set.

   @public
   @param key {string} Key string 
   @param member1 {string} member 1 
   @param member2 {string} member 2 
   @param unit {Object} geo unit 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.geodistWithUnit = function(key, member1, member2, unit, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.geodistWithUnit(key, member1, member2, io.vertx.redis.op.GeoUnit.valueOf(unit), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
   of the area specified with the center location and the maximum distance from the center (the radius).

   @public
   @param key {string} Key string 
   @param longitude {number} longitude 
   @param latitude {number} latitude 
   @param radius {number} radius 
   @param unit {Object} geo unit 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.georadius = function(key, longitude, latitude, radius, unit, handler) {
    var __args = arguments;
    if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] ==='number' && typeof __args[4] === 'string' && typeof __args[5] === 'function') {
      j_redisClient.georadius(key, longitude, latitude, radius, io.vertx.redis.op.GeoUnit.valueOf(unit), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
   of the area specified with the center location and the maximum distance from the center (the radius).

   @public
   @param key {string} Key string 
   @param longitude {number} longitude 
   @param latitude {number} latitude 
   @param radius {number} radius 
   @param unit {Object} geo unit 
   @param options {Object} geo radius options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.georadiusWithOptions = function(key, longitude, latitude, radius, unit, options, handler) {
    var __args = arguments;
    if (__args.length === 7 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] ==='number' && typeof __args[4] === 'string' && (typeof __args[5] === 'object' && __args[5] != null) && typeof __args[6] === 'function') {
      j_redisClient.georadiusWithOptions(key, longitude, latitude, radius, io.vertx.redis.op.GeoUnit.valueOf(unit), options != null ? new GeoRadiusOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
   to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
   index represented by the sorted set.

   @public
   @param key {string} Key string 
   @param member {string} member 
   @param radius {number} radius 
   @param unit {Object} geo unit 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.georadiusbymember = function(key, member, radius, unit, handler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_redisClient.georadiusbymember(key, member, radius, io.vertx.redis.op.GeoUnit.valueOf(unit), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
   to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
   index represented by the sorted set.

   @public
   @param key {string} Key string 
   @param member {string} member 
   @param radius {number} radius 
   @param unit {Object} geo unit 
   @param options {Object} geo radius options 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.georadiusbymemberWithOptions = function(key, member, radius, unit, options, handler) {
    var __args = arguments;
    if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] === 'string' && (typeof __args[4] === 'object' && __args[4] != null) && typeof __args[5] === 'function') {
      j_redisClient.georadiusbymemberWithOptions(key, member, radius, io.vertx.redis.op.GeoUnit.valueOf(unit), options != null ? new GeoRadiusOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Instruct the server whether to reply to commands.

   @public
   @param options {Object} 
   @param handler {function} 
   @return {RedisClient}
   */
  this.clientReply = function(options, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.clientReply(io.vertx.redis.op.ClientReplyOptions.valueOf(options), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the length of the value of a hash field.

   @public
   @param key {string} Key String 
   @param field {string} field 
   @param handler {function} 
   @return {RedisClient}
   */
  this.hstrlen = function(key, field, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_redisClient.hstrlen(key, field, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Alters the last access time of a key(s). Returns the number of existing keys specified.

   @public
   @param key {string} Key String 
   @param handler {function} 
   @return {RedisClient}
   */
  this.touch = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.touch(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Alters the last access time of a key(s). Returns the number of existing keys specified.

   @public
   @param keys {Array.<string>} list of keys 
   @param handler {function} 
   @return {RedisClient}
   */
  this.touchMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.touchMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the debug mode for executed scripts.

   @public
   @param scriptDebugOptions {Object} the option 
   @param handler {function} 
   @return {RedisClient}
   */
  this.scriptDebug = function(scriptDebugOptions, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.scriptDebug(io.vertx.redis.op.ScriptDebugOptions.valueOf(scriptDebugOptions), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Perform arbitrary bitfield integer operations on strings.

   @public
   @param key {string} Key string 
   @param bitFieldOptions {Object} 
   @param handler {function} 
   @return {RedisClient}
   */
  this.bitfield = function(key, bitFieldOptions, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_redisClient.bitfield(key, bitFieldOptions != null ? new BitFieldOptions(new JsonObject(Java.asJSONCompatible(bitFieldOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Perform arbitrary bitfield integer operations on strings.

   @public
   @param key {string} Key string 
   @param commands {Object} 
   @param overflow {Object} 
   @param handler {function} 
   @return {RedisClient}
   */
  this.bitfieldWithOverflow = function(key, commands, overflow, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_redisClient.bitfieldWithOverflow(key, commands != null ? new BitFieldOptions(new JsonObject(Java.asJSONCompatible(commands))) : null, io.vertx.redis.op.BitFieldOverflowOptions.valueOf(overflow), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.

   @public
   @param key {string} Key to delete 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.unlink = function(key, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisClient.unlink(key, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete multiple keys asynchronously in another thread. Otherwise it is just as DEL, but non blocking.

   @public
   @param keys {Array.<string>} List of keys to delete 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.unlinkMany = function(keys, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_redisClient.unlinkMany(utils.convParamListBasicOther(keys), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Swaps two Redis databases

   @public
   @param index1 {number} index of first database to swap 
   @param index2 {number} index of second database to swap 
   @param handler {function} Handler for the result of this call. 
   @return {RedisClient}
   */
  this.swapdb = function(index1, index2, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_redisClient.swapdb(index1, index2, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_redisClient;
};

RedisClient._jclass = utils.getJavaClass("io.vertx.redis.RedisClient");
RedisClient._jtype = {
  accept: function(obj) {
    return RedisClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(RedisClient.prototype, {});
    RedisClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RedisClient._create = function(jdel) {
  var obj = Object.create(RedisClient.prototype, {});
  RedisClient.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-redis-js/redis_client
 @param vertx {Vertx} 
 @param config {Object} 
 @return {RedisClient}
 */
RedisClient.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(RedisClient, JRedisClient.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(RedisClient, JRedisClient.create(__args[0]._jdel, __args[1] != null ? new RedisOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = RedisClient;