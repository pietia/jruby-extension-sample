import java.io.IOException;
import org.jruby.Ruby;
import org.jruby.ext.rbtree.RBTreeLibrary;
import org.jruby.runtime.load.BasicLibraryService;

public class RBTreeService implements BasicLibraryService {
    public boolean basicLoad(final Ruby runtime) throws IOException {
        new RBTreeLibrary().load(runtime, false);
        return true;
    }
}
