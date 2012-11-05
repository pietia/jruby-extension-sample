package org.jruby.ext.rbtree;

import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.RubyModule;
import org.jruby.RubyObject;
import org.jruby.anno.JRubyClass;
import org.jruby.anno.JRubyMethod;
import org.jruby.runtime.ObjectAllocator;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.runtime.load.Library;

import java.io.IOException;

public class RBTreeLibrary implements Library {

    public void load(Ruby runtime, boolean wrap) throws IOException {
                RubyClass klazz = runtime.defineClass("X", runtime.getObject(), RBTREE_ALLOCATOR);
                klazz.setAllocator(RBTREE_ALLOCATOR);
                klazz.defineAnnotatedMethods(X.class);
    }

    private static final ObjectAllocator RBTREE_ALLOCATOR = new ObjectAllocator() {
        public IRubyObject allocate(Ruby runtime, RubyClass klazz) {
            return new X(runtime, klazz);
        }
    };

    // temp!
    @JRubyClass(name="X", parent="Object")
    public static class X extends RubyObject {

        public X(Ruby runtime, RubyClass klass) {
            super(runtime, klass);
        }

        @JRubyMethod
        public IRubyObject initialize(ThreadContext context) {
            Ruby runtime = context.getRuntime();
            return runtime.getNil();
        }

        @JRubyMethod
        public IRubyObject initialize(ThreadContext context, IRubyObject value) {
            Ruby runtime = context.getRuntime();
            return runtime.getNil();
        }


    }

}