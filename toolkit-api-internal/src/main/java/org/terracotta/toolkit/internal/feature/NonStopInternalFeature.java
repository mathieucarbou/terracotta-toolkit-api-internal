/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 * All rights reserved.
 */
package org.terracotta.toolkit.internal.feature;

import org.terracotta.toolkit.ToolkitFeature;

/**
 * Feature that can be used to control internal aspects of NonStop.
 */
public interface NonStopInternalFeature extends ToolkitFeature {

  /**
   * Enable or disable NonStop for current thread.
   */
  void enableForCurrentThread(boolean enable);

}

