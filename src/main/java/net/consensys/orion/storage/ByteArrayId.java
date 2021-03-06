/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package net.consensys.orion.storage;

import java.io.Serializable;
import java.util.Arrays;

public class ByteArrayId implements Serializable {
  private byte[] key;

  public byte[] getKey() {
    return key;
  }

  public void setKey(final byte[] key) {
    this.key = key;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ByteArrayId that = (ByteArrayId) o;
    return Arrays.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(key);
  }
}
