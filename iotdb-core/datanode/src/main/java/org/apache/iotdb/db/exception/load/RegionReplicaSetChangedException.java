/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.db.exception.load;

import org.apache.iotdb.common.rpc.thrift.TRegionReplicaSet;

public class RegionReplicaSetChangedException extends LoadFileException {

  public RegionReplicaSetChangedException(TRegionReplicaSet original, TRegionReplicaSet current) {
    super(
        String.format(
            "Region replica set changed from %s to %s during loading TsFile, maybe due to region migration",
            original, current));
  }

  public RegionReplicaSetChangedException() {
    super("Region replica set changed during loading TsFile, maybe due to region migration");
  }
}
