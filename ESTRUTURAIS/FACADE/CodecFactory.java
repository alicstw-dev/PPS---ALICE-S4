package ESTRUTURAIS.FACADE;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();

        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extraindo áudio mpeg...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extraindo áudio ogg...");
            return new OggCompressionCodec();
        }
    }
}
