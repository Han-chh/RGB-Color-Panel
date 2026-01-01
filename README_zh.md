# RGB颜色面板

使用Swing构建的RGB颜色调色板应用程序。允许用户输入RGB值并可视化生成的颜色。

## 功能

- RGB值输入字段（0-255）
- 实时颜色可视化
- 颜色显示面板
- 重置功能
- 输入验证
- 键盘导航（Enter键在字段间移动）

## 要求

- Java开发工具包（JDK）8或更高版本

## 运行

```bash
java -jar RGB-Color-Panel.jar
```

## 使用方法

1. 启动应用程序
2. 在相应字段中输入RGB值（0-255）
3. 点击"generate"或在蓝色字段中按Enter显示颜色
4. 使用"Reset"清除所有字段并重置显示

## 项目结构

- `src/com/rgbcolorpanel/Main.java`：主应用程序窗口
- `src/com/rgbcolorpanel/RGBColorPanel.java`：RGB颜色选择面板
- `bin/`：编译的类文件

## 贡献

欢迎贡献改进或附加颜色功能！