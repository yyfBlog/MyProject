# MyProject
便捷ui库(持续增加新的)  

EasyDialog easyDialog = new EasyDialog();  
easyDialog.setStyle(0);  
easyDialog.show(getSupportFragmentManager(), "");  
![image](https://github.com/yyfBlog/MyProject/blob/master/dialog_style_01.png)


EasyDialog easyDialog = new EasyDialog();  
easyDialog.setStyle(2);  
easyDialog.show(getSupportFragmentManager(), "");  
![image](https://github.com/yyfBlog/MyProject/blob/master/dialog_style_02.png)

<pre>
<code>
        EasyDialog.builder()
                .setDialogTitleText("标题")
                .setDialogContent("我是内容", Gravity.LEFT)
                .setCancelButtonText("取消")
                .setOkButtonText("确定")
                .setOnclickListener(new DialogInterface() {
                    @Override
                    public void onClick(DialogFragment dialog, int which) {
                        if (which == 0) { //取消
                            dialog.dismiss();
                        } else if (which == 1) {//确定

                        }
                    }
                })
                .show(getSupportFragmentManager(), "");	
</code>
</pre>
![image](https://github.com/yyfBlog/MyProject/blob/master/dialog_style_03.png)  

# ListView 无数据 无网络时的提示 可以自由给定图片，文字提示
EmptyView emptyView = new EmptyView(this, lv_data);  
emptyView.showEmptyView(R.drawable.ic_empty,"没有数据...");
![image](https://github.com/yyfBlog/MyProject/blob/master/empty)  
 