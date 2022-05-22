/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.service84.library.featureflagdefaultvalue.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.service84.library.featureflag.services.FeatureFlagAPIBase;

@Service("E941C4D7-E3E6-4ED6-B120-0FDFC0C11985")
public class FeatureFlagDefaultValue extends FeatureFlagAPIBase {
  private static final Logger logger = LoggerFactory.getLogger(FeatureFlagDefaultValue.class);

  @Override
  public Boolean getValue(String flagName, String user) {
    logger.debug("getValue");
    return Boolean.TRUE;
  }

  @Override
  public Boolean getValue(String flagName, String user, Boolean defaultValue) {
    logger.debug("getValue");
    return defaultValue;
  }

  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    logger.debug("getFlag");
    return defaultValue;
  }
}
