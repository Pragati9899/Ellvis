package utilities;

public class Utility {
   /* public static AndroidDriver driver;

    public static String decodeQRCode(BufferedImage qrCodeImage) throws NotFoundException {

        LuminanceSource source = new BufferedImageLuminanceSource(qrCodeImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        // result = new MultiFormatReader().decodeWithState(bitmap);
        // result = .decode(bitmap);
        com.google.zxing.Result result = new MultiFormatReader().decode(bitmap);
        //   Bitmap resize = Bitmap.createScaledBitmap(srcBitmap, dstWidth,dstHeight,false);


        return Objects.requireNonNull(result).getText();
    }

    public BufferedImage generateImage(WebElement element, File screenshot) throws IOException {
        BufferedImage fullImage = ImageIO.read(screenshot);
        Point imageLocation = element.getLocation();

        int qrCodeImageWidth = element.getSize().getWidth();
        int qrCodeImageHeight = element.getSize().getHeight();

        int pointXPosition = imageLocation.getX();
        int pointYPosition = imageLocation.getY();

        BufferedImage qrCodeImage = fullImage.getSubimage(pointXPosition, pointYPosition, qrCodeImageWidth, qrCodeImageHeight);
        ImageIO.write(qrCodeImage, "png", screenshot);

        return qrCodeImage;
    }*/
}
