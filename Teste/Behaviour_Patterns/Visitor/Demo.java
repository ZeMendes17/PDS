package Visitor;

public class Demo {
    public static void main(String[] args) {
        Router[] routers = new Router[] {
            new DLinkRouter(),
            new TPLinkRouter(),
            new LinkSysRouter()
        };

        RouterVisitor[] visitors = new RouterVisitor[] {
            new MacConfigurator(),
            new LinuxConfigurator()
        };

        for (Router router : routers) {
            for (RouterVisitor visitor : visitors) {
                router.accept(visitor);
            }
        }

        // Output:
        // DLinkRouter Configuration for Mac complete !!
        // DLinkRouter Configuration for Linux complete !!
        // TPLinkRouter Configuration for Mac complete !!
        // TPLinkRouter Configuration for Linux complete !!
        // LinkSysRouter Configuration for Mac complete !!
        // LinkSysRouter Configuration for Linux complete !!
    }
}
