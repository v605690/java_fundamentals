package labs_examples.objects_classes_methods.labs.objects.HomeBuild;

public class House {
    OuterHomeBuild outerHomeBuild;
    InnerHomeBuild innerHomeBuild;

    public House(OuterHomeBuild outerHomeBuild, InnerHomeBuild innerHomeBuild) {
        this.outerHomeBuild = outerHomeBuild;
        this.innerHomeBuild = innerHomeBuild;
    }

    public OuterHomeBuild getOuterHomeBuild() {
        return outerHomeBuild;
    }

    public void setOuterHomeBuild(OuterHomeBuild outerHomeBuild) {
        this.outerHomeBuild = outerHomeBuild;
    }

    public InnerHomeBuild getInnerHomeBuild() {
        return innerHomeBuild;
    }

    public void setInnerHomeBuild(InnerHomeBuild innerHomeBuild) {
        this.innerHomeBuild = innerHomeBuild;
    }

    @Override
    public String toString() {
        return "House{" +
                "outerHomeBuild=" + outerHomeBuild +
                ", innerHomeBuild=" + innerHomeBuild +
                '}';
    }
}
