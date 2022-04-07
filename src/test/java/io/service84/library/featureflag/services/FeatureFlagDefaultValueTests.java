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

package io.service84.library.featureflag.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.service84.library.featureflag.services.impl.defaultvalue.FeatureFlagDefaultValue;

@ExtendWith(SpringExtension.class)
public class FeatureFlagDefaultValueTests {
  @TestConfiguration
  public static class Configuration {
    @Bean
    public FeatureFlagAPI getFeatureFlagAPI() {
      return new FeatureFlagDefaultValue();
    }
  }

  public static String TestFlag = "TestFlag";
  public static String TestUser = "TestUser";

  // Test Subject
  @Autowired private FeatureFlagAPI featureFlagService;

  @SuppressWarnings({"deprecation"})
  @Test
  public void getFlagDefaultFalse() {
    Boolean flag = featureFlagService.getFlag(TestFlag, TestUser, Boolean.FALSE);
    assertFalse(flag);
  }

  @SuppressWarnings({"deprecation"})
  @Test
  public void getFlagDefaultTrue() {
    Boolean flag = featureFlagService.getFlag(TestFlag, TestUser, Boolean.TRUE);
    assertTrue(flag);
  }

  @Test
  public void getValueDefaultFalse() {
    Boolean flag = featureFlagService.getValue(TestFlag, TestUser, Boolean.FALSE);
    assertFalse(flag);
  }

  @Test
  public void getValueDefaultTrue() {
    Boolean flag = featureFlagService.getValue(TestFlag, TestUser, Boolean.TRUE);
    assertTrue(flag);
  }

  @Test
  public void getValue() {
    Boolean flag = featureFlagService.getValue(TestFlag, TestUser);
    assertTrue(flag);
  }

  @Test
  public void existenceTest() {
    assertNotNull(featureFlagService);
  }
}
