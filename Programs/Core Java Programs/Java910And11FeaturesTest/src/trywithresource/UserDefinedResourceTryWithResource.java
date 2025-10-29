package trywithresource;
class MyResource implements AutoCloseable{
    String name;
    MyResource(String name){
        this.name = name;
    }
    public void working() {
        System.out.println(name+" Working ");
    }

    @Override
    public void close() throws Exception {
        System.out.println(name+" resource close");
    }
}
public class UserDefinedResourceTryWithResource {
    public static void main(String[] args) {
        // 1st but close method didn't call
//        MyResource resource1 = new MyResource("Resource1");
//        MyResource resource2 = new MyResource("Resource2");
//        resource1.working();
//        resource2.working();

            // Java 7
//            try(
//                MyResource resource1 = new MyResource("Resource1");
//                MyResource resource2 = new MyResource("Resource2");
//                ){
//                resource1.working();
//                resource2.working();
//        }catch (Exception e){
//
//        }

        // Java 9
        MyResource resource1 = new MyResource("Resource1");
        MyResource resource2 = new MyResource("Resource2");
            try(
                resource1;
                resource2;
                ){
            resource1.working();
            resource2.working();
        }catch (Exception e){

        }
    }
}
