
## 项目clone流程

- clone 的时候不要 clone master，开发人员使用参数-b来 clone 自己的分支即可。
```
# 浏览器复制Git地址，在终端使用 -b 克隆自己的分支
git clone -b deltaqin https://github.com/delta-qin/bilibili-bigdata-backend.git

# 查看当前本地以及远程分支
git branch -a

# 继续拉取远程dev分支在本地创建新分支dev
git checkout -b dev origin/dev
# 上述执行失败但是远程的确有dev分支的话说明本地没有远程的缓存，执行git fetch取回远程信息即可执行
# 也可以 git pull origin dev:dev ，但是拉下来还要建立追踪，不用

# 再次查看当前分支
git branch -a
```

## 分支结构
master 为可运行 release 版本，可以直接部署的，一般不动。

dev 分支为团队总开发分支，所有开发人员在自己的分支上面开发，开发好之后，再merge到dev分支，上传到仓库 （由于是内部开发，所以没有pr，需要开发人员自己解决代码冲突之后将自己的开发分支merge到dev分支再push）

liutongyuan  分支为开发人员自己的工作分支，用于开发自己的功能，每次开发一个小功能之后自己分支先merge dev分支，确定正常之后，切换到dev分支， merge 自己的开发分支(此时就是fast-forward)，最后push自己的和dev分支

qinzetao 分支为开发人员自己的工作分支，用于开发自己的功能，每次开发一个小功能之后自己分支先merge dev分支，确定正常之后，切换到dev分支， merge 自己的开发分支，最后push自己的和dev分支

## 提交代码流程
1. 开发完之后拉取 pull 远程dev分支最新代码merge到自己的工作分支，此时由于本地没有commit（自己的分支内容起点此时应该是dev分支的某一次commit），所以不会产生代码冲突
	- git pull origin <source>:<destination>
	- git pull origin dev:dev

2. 自己在自己的分支commit 自己的修改，之后在自己的分支merge dev分支，之后解决冲突。
3. 之后切换到dev分支，在dev分支将自己的工作分支 merge 到 dev 分支
4. 上传dev和自己的分支
	- git push origin <source>:<destination>
	- git push origin dev:dev 如果当前在dev分支，想要上传dev分支，则可以直接使用git push否则要写全
	- git push origin deltaqin:deltaqin

## 流程命令演示
```
set https_proxy=http://127.0.0.1:10080
#初始确保在自己分支下，未在则git checkout liutongyuan
git branch -a
# 执行上面确保自己在自己的工作分支
# 一定要在自己的分支下面开发
git add .  # 添加所有的修改到stage
git commit -m "lty分支已修改" 

# 后面修改为自己工作分支的名字
git pull origin dev:dev
git merge dev

#无冲突下三句不用执行
git diff
# 修复冲突之后
git add .
git commit -m "冲突修复" 

# 切换到dev分支
git checkout dev
git merge liutongyuan
git push origin dev:dev
git push origin liutongyuan:liutongyuan
git checkout liutongyuan
```

