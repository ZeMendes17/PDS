package Visitor;

public interface RouterVisitor {
    public void visit(DLinkRouter router);
    public void visit(LinkSysRouter router);
    public void visit(TPLinkRouter router);
}
