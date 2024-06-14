package abstractfactory.pattern;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
