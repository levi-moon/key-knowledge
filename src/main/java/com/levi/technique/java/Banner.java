package com.levi.technique.java;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @ClassName: Banner
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/12/18 9:13
 */
public class Banner {

    public static void main(String[] args) throws IOException {
        FontRenderContext context = new FontRenderContext(new AffineTransform(), false, false);
        /**
         * Font.PLAIN（普通）
         * Font.BOLD（加粗）
         * Font.ITALIC（斜体）
         * Font.BOLD+ Font.ITALIC（粗斜体）
         */
        Font font = new Font("微软雅黑", Font.PLAIN, 24);
        String content = " X J G J ";
        double width = font.getStringBounds(content, context).getWidth();//计算图片的宽
        double height = font.getStringBounds(content, context).getHeight();//计算高c
        int minx = (int) width;
        int miny = (int) (height * 1.5);
        BufferedImage bufferedImage = new BufferedImage(minx, miny, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        //设置背影为白色
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);
        graphics.drawString(content, 0, (int) height);//图片上写文字
        graphics.dispose();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < miny; i++) {
            for (int j = 0; j < minx; j++) {
                int rgb = bufferedImage.getRGB(j, i);
                if (rgb != -1) {
                    sb.append((int) (Math.random() * (9 + 1)));
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

}
