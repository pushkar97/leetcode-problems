package com.github.pushkar97.common;

import java.lang.reflect.InvocationTargetException;
import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class SolutionSupplier implements ParameterResolver {
  @Override
  public boolean supportsParameter(
      final ParameterContext parameterContext, final @NonNull ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return parameterContext.findAnnotation(SolRef.class).isPresent();
  }

  @Override
  public Object resolveParameter(
      final @NonNull ParameterContext parameterContext,
      final @NonNull ExtensionContext extensionContext)
      throws ParameterResolutionException {
    try {
      return parameterContext.getParameter().getType().getDeclaredConstructor().newInstance();
    } catch (InstantiationException
        | IllegalAccessException
        | InvocationTargetException
        | NoSuchMethodException e) {
      throw new ParameterResolutionException(e.getMessage(), e);
    }
  }
}
