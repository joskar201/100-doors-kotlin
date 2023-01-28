# [X] See hard-wired-test-name.txt

CLASSES=.:`ls /usr/share/kotlin/kotlinc/lib/*.jar | tr '\n' ':'`
CLASSES=`ls /kotlin/*.jar | tr '\n' ':'`${CLASSES}
kotlinc *.kt -include-runtime -cp $CLASSES
if [ $? -eq 0 ]; then
  java -cp $CLASSES \
    io.kotlintest.runner.console.LauncherKt \
    --writer basic \
    --spec hiker.HikerTest  # [X]
fi
