package ESTRUTURAIS.FACADE;


public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();

        converter.convertVideo(
                "youtubevideo.ogg",
                "mp4"
        );

        // ...
    }
}
