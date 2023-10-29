package Task2_1_10_1;

import Task2_1_10_1.utils2_1_3_1.ImageUtils;
import Task2_1_10_1.utils2_1_3_1.RgbMaster;

import java.awt.image.BufferedImage;

public class Task2_1_10_1 {
    public static void main(String[] args) throws Exception {
//        final BufferedImage image = ImageUtils.getImage("2_1_19_1_images/Picture_Mountain_Lake.png");
        final BufferedImage image0 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");
        final BufferedImage image1 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");
        final BufferedImage image2 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");
        final BufferedImage image3 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");
        final BufferedImage image4 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");
        final BufferedImage image5 = ImageUtils.getImage("src/Task2_1_10_1/Images2_1_10_1/Picture_Mountain_Lake.png");


        // Способ 0. Применён фильтр: такая же картинка
        ImageUtils.saveImage(image0, "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake0.png");
//        image.getAlphaRaster() != null;
//        final int[] rgbArray = image.getRGB(0, 0, width, height, null, 0, height*width);
        // (int startX, int startY, int w, int h,
        //                        int[] rgbArray, int offset, int scansize)
        System.out.println("Выполнен Способ 0. Применён фильтр: такая же картинка.");
        // Способ 0. Применён фильтр: такая же картинка. Конец


        // Способ 1. Применён фильтр: монохромный.
        final RgbMaster rgbMaster1 = new RgbMaster(image1);
        rgbMaster1.changeImage((float[] rgb) -> {
            final float mean = (rgb[0] + rgb[1] + rgb[2]) / 3;
            rgb[0] = mean;
            rgb[1] = mean;
            rgb[2] = mean;
            return rgb;
        });
        ImageUtils.saveImage(rgbMaster1.getImage(), "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake1.png");
        System.out.println("Выполнен Способ 1. Применён фильтр: монохромный.");
        // Способ 1. Применён фильтр: монохромный. Конец


        // Способ 2. Применён фильтр: только красный компонент пикселей
        final RgbMaster rgbMaster2 = new RgbMaster(image2);
        rgbMaster2.changeImage(FilterOperation::onlyRed);
        ImageUtils.saveImage(rgbMaster2.getImage(), "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake2.png");
        System.out.println("Выполнен Способ 2. Применён фильтр: только красный компонент пикселей.");
        // Способ 2. Применён фильтр: только красный компонент пикселей. Конец


        // Способ 3. Применён фильтр: только зеленый компонент пикселей
        final RgbMaster rgbMaster3 = new RgbMaster(image3);
        rgbMaster3.changeImage(FilterOperation::onlyGreen);
        ImageUtils.saveImage(rgbMaster3.getImage(), "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake3.png");
        System.out.println("Выполнен Способ 3. Применён фильтр: только зеленый компонент пикселей.");
        // Способ 3. Применён фильтр: только зеленый компонент пикселей. Конец


        // Способ 4. Применён фильтр: только синий компонент пикселей
        final RgbMaster rgbMaster4 = new RgbMaster(image4);
        rgbMaster4.changeImage(FilterOperation::onlyBlue);
        ImageUtils.saveImage(rgbMaster4.getImage(), "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake4.png");
        System.out.println("Выполнен Способ 4. Применён фильтр: только синий компонент пикселей.");
        // Способ 4. Применён фильтр: только синий компонент пикселей. Конец


        // Способ 5. Применён фильтр: сепия
        final RgbMaster rgbMaster5 = new RgbMaster(image5);
        rgbMaster5.changeImage(FilterOperation::/*greyScale *//**//**//**//*onlyRed*//**//* onlyGreen *//*
                onlyBlue */sepia);
        ImageUtils.saveImage(rgbMaster5.getImage(), "src/Task2_1_10_1/Images2_1_10_1/cloned_Picture_Mountain_Lake5.png");
        System.out.println("Выполнен Способ 5. Применён фильтр: сепия.");
        // Способ 5. Применён фильтр: сепия. Конец

    }
}
