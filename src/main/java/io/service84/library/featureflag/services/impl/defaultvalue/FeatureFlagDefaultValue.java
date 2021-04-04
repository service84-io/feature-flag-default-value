package io.service84.library.featureflag.services.impl.defaultvalue;

import io.service84.library.featureflag.services.FeatureFlagAPI;

public class FeatureFlagDefaultValue implements FeatureFlagAPI {

  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    return defaultValue;
  }
}
