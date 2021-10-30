package io.service84.library.featureflag.services.impl.defaultvalue;

import org.springframework.stereotype.Service;

import io.service84.library.featureflag.services.FeatureFlagAPIBase;

@Service("E941C4D7-E3E6-4ED6-B120-0FDFC0C11985")
public class FeatureFlagDefaultValue extends FeatureFlagAPIBase {
  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    return defaultValue;
  }
}
