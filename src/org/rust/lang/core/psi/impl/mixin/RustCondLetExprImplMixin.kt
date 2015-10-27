package org.rust.lang.core.psi.impl.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import org.rust.lang.core.psi.RustCondLetExpr
import org.rust.lang.core.psi.RustPatIdent
import org.rust.lang.core.psi.impl.RustCompositeElementImpl
import org.rust.lang.core.psi.util.boundIdentifiers

abstract class RustCondLetExprImplMixin(node: ASTNode) : RustCompositeElementImpl(node)
        , RustCondLetExpr {

    override fun listDeclarations(before: PsiElement): List<RustPatIdent> = pat.boundIdentifiers
}