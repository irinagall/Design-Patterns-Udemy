package abstractfactory.pattern;

public class Client {
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory dataSourceFactory) {
        service = dataSourceFactory.createService();
        response = dataSourceFactory.createResponse();
    }

    public void communicate(){
        if(service != null & response != null){
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
