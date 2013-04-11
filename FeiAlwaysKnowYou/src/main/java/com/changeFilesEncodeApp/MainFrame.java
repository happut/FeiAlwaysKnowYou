/*
 * @(#)MainFrame.java 2013-4-11 下午03:56:50 FeiAlwaysKnowYou Copyright 2013
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.changeFilesEncodeApp;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MainFrame
 * @author wfei
 * @version 1.0
 *
 */
public class MainFrame extends JFrame {
    private Container container;

    private JLabel folderName;

    private JLabel folderInfo;

    private JButton folderNameSelect;

    private JLabel sourceInfo;

    private JComboBox sourceCombo;

    private JComboBox targetCombo;

    private JLabel targetInfo;

    private JButton confirm;

    public MainFrame() {
        Init();
        process();
    }

    private void process() {
        northPanel();
        centerPanel();
        tailPanel();
        validate();
    }

    public void Init() {
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(new Dimension(400, 250));
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        container = this.getContentPane();
    }

    public static void main(String[] args) {
        new MainFrame();

    }

    public void northPanel() {
        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(400, 50));
        folderName = new JLabel("测试");
        folderName.setFont(new Font("微软雅黑", 0, 20));
        north.add(folderName);
        container.add(north, "North");
    }

    public void centerPanel() {
        folderInfo = new JLabel("请选择文件夹");
        folderNameSelect = new JButton("选择");
        sourceInfo = new JLabel("请选择源编码");
        sourceCombo = new JComboBox(new Object[] { "UTF-8", "GBK" });
        targetInfo = new JLabel("请选择目标编码");
        targetCombo = new JComboBox(new Object[] { "UTF-8", "GBK" });

        JPanel main = new JPanel();
        main.setPreferredSize(new Dimension(400, 150));
        main.setBorder(BorderFactory.createTitledBorder("工作区"));

        main.add(folderInfo);
        main.add(folderNameSelect);
        main.add(sourceInfo);
        main.add(sourceCombo);
        main.add(targetInfo);
        main.add(targetCombo);
        main.setLayout(new GridLayout(3, 2));
        container.add(main, "Center");
    }

    public void tailPanel() {
        JPanel tail = new JPanel();
        tail.setPreferredSize(new Dimension(400, 50));

        confirm = new JButton("确认");

        tail.add(confirm);
        container.add(tail, "South");
    }
}
