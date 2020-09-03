package com.zy.demo;

import org.osgeo.proj4j.*;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2020/8/7 16:28</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 关于坐标系转换，注意这里哈，在转换的时候是需要7个参数的，这里是写死的，可能是不对的哈
 *
 * 类说明： 80转84坐标系
 *
 * @author zhengyu
 */
public class CoordinateTrans {

    public CoordinateTransform coordtrans() {

        CRSFactory targetFactory = new CRSFactory();
        CRSFactory crsFactory = new CRSFactory();
        //目标坐标系统
        String target_param =  "+proj=longlat +datum=WGS84 +no_defs ";
        CoordinateReferenceSystem target = targetFactory.createFromParameters("wgs84", target_param);
        //源坐标系统
        String xian80_param = "+proj=longlat +a=6378140 +b=6356755.288157528 +towgs84=115.8,-154.4,-82.3,0,0,0,8 +no_defs ";
        CoordinateReferenceSystem xian80 = crsFactory.createFromParameters("xian80", xian80_param);

        CoordinateTransformFactory ctf = new CoordinateTransformFactory();
        CoordinateTransform transform = ctf.createTransform(xian80, target);
        return transform;
    }

    public static void main(String[] args) {

        CoordinateTrans coordinateTrans = new CoordinateTrans();
        CoordinateTransform transforms = coordinateTrans.coordtrans();
        if (transforms != null) {
            ProjCoordinate projCoordinate = new ProjCoordinate(112.312352279722,41.8694921486111);
            transforms.transform(projCoordinate, projCoordinate);
            Double dNorth = projCoordinate.y;
            Double dEast = projCoordinate.x;
            System.out.print(dNorth);
            System.out.print("/");
            System.out.print(dEast);

        }


    }
}
