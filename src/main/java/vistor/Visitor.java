package vistor;

import vistor.Directory;
import vistor.File;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-12 23:38
 **/
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
