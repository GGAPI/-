#include<iostream>
#include"highgui.h"
#include<imgproc\imgproc_c.h>
using namespace cv;
using namespace std;
int main(int argc,char** argv)
{
	Mat ImageIn;
	ImageIn = imread("test.jpg");
	if(ImageIn.empty())
	{
		cout<<"��ǰĿ¼���Ҳ���test.jpg�ļ�"<<endl;
		waitKey(0);
		return -1;
	}
	namedWindow("girl",CV_WINDOW_AUTOSIZE);
	imshow("girl",ImageIn);
	waitKey(0);
	destroyWindow("girl");
	return 0;
}