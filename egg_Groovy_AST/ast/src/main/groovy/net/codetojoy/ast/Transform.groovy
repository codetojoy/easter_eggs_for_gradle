package net.codetojoy.ast

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.INSTRUCTION_SELECTION)
class Transform implements ASTTransformation {

    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        if (!astNodes) return
        if (!astNodes[0]) return
        if (!astNodes[1]) return
        if (!(astNodes[0] instanceof AnnotationNode)) return
        if (astNodes[0].classNode?.name != Marker.class.name) return

        ClassNode annotatedClass = (ClassNode) astNodes[1]
        MethodNode newMethod = makeMethod(annotatedClass)
        annotatedClass.addMethod(newMethod)
    }

    MethodNode makeMethod(ClassNode source) {
        def ast = new AstBuilder().buildFromString(CompilePhase.INSTRUCTION_SELECTION, false,
                "def foo() { println 'TRACER hello from foo' }"
        )
        return (MethodNode) ast[1].methods.find { it.name == 'foo' }
    }
}
