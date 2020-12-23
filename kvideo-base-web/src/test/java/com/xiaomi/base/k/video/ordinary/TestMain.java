package com.xiaomi.base.k.video.ordinary;

import com.google.gson.reflect.TypeToken;
import com.xiaomi.base.k.video.utils.GSONUtil;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 普通测试
 *
 * @author jianglianglong
 * @date: 2020/8/18 11:25
 */
public class TestMain {

    /**
     * 条件判断
     */
    @Test
    public void testConditional() {
//        String fullDeptDescr = "[{\"deptEnName\":\"Xiaomi Company\",\"deptId\":\"MI\",\"deptName\":\"小米公司\",\"level\":\"0\"},{\"deptEnName\":\"Information\",\"deptId\":\"IT\",\"deptName\":\"信息技术部\",\"level\":\"1\"},{\"deptEnName\":\"Platform&IT\",\"deptId\":\"IT41\",\"deptName\":\"平台&IT部\",\"level\":\"2\"},{\"deptEnName\":\"Test Group\",\"deptId\":\"IT4101\",\"deptName\":\"测试组\",\"level\":\"3\"},{\"deptEnName\":\"Test Team-1\",\"deptId\":\"IT410101\",\"deptName\":\"测试一队\",\"level\":\"4\"}]";
        String fullDeptDescr = "[{\"deptEnName\":\"Xiaomi Company\",\"deptId\":\"MI\",\"deptName\":\"小米公司\",\"level\":\"0\"}," +
                "{\"deptEnName\":\"Information\",\"deptId\":\"IT\",\"deptName\":\"信息技术部\",\"level\":\"1\"}," +
//                "{\"deptEnName\":\"Platform&IT\",\"deptId\":\"IT41\",\"deptName\":\"平台&IT部\",\"level\":\"2\"}," +
                "{\"deptEnName\":\"Test Group\",\"deptId\":\"IT4101\",\"deptName\":\"测试组\",\"level\":\"3\"}," +
                "{\"deptEnName\":\"Test Team-1\",\"deptId\":\"IT410101\",\"deptName\":\"测试一队\",\"level\":\"4\"}]";

        Map<Integer, DepartmentDto> departmentDtoMap = null;
        try {
            List<DepartmentDto> departmentDtoList = GSONUtil.toObject(fullDeptDescr, new TypeToken<List<DepartmentDto>>() {
            }.getType());

            departmentDtoMap = departmentDtoList.stream().collect(Collectors.toMap(DepartmentDto::getLevel, departmentDto -> departmentDto));
        } catch (Exception e) {
            System.out.println("解析");
        }

        if (CollectionUtils.isEmpty(departmentDtoMap) || departmentDtoMap.get(2) == null && departmentDtoMap.get(1) == null) {
            System.err.println("null");
        }

    }

    @Test
    public void testListForeach() {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        // ConcurrentModificationException
        a.removeIf("2"::equals);
        a.forEach(System.out::println);

    }

    @Test
    public void testQuMo() {
        //4 3 5 6 7 8 --- 循环2次
        //7 8 4 3 5 6
        System.out.println((4 + 2) % 6);

    }
}
