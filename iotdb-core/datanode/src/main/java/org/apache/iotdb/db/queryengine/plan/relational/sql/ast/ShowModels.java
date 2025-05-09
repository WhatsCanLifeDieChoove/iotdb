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

package org.apache.iotdb.db.queryengine.plan.relational.sql.ast;

import com.google.common.collect.ImmutableList;

import java.util.List;

import static com.google.common.base.MoreObjects.toStringHelper;

public class ShowModels extends Statement {

  private String modelId = null;

  public ShowModels() {
    super(null);
  }

  @Override
  public List<? extends Node> getChildren() {
    return ImmutableList.of();
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public String getModelId() {
    return modelId;
  }

  @Override
  public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
    return visitor.visitShowModels(this, context);
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ShowModels)) {
      return false;
    }
    if (modelId == null) {
      return ((ShowModels) obj).getModelId() == null;
    }
    return modelId.equals(((ShowModels) obj).getModelId());
  }

  @Override
  public String toString() {
    return toStringHelper(this).toString();
  }
}
