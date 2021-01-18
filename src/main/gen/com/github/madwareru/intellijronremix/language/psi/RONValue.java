// This is a generated file. Not intended for manual editing.
package com.github.madwareru.intellijronremix.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RONValue extends PsiElement {

  @Nullable
  RONBool getBool();

  @Nullable
  RONList getList();

  @Nullable
  RONMap getMap();

  @Nullable
  RONObject getObject();

  @Nullable
  RONOption getOption();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getFloat();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getString();

}
