public class Camera {
    private String cameraName = "CAMERA";
    private static Camera _instance;
    private static Object obj;

    private Camera(){}

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public static Camera getInstance(){
        if(_instance == null){
            synchronized (obj){
                if (_instance == null){
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }
}
