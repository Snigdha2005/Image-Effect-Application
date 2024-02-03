#include<vector>
//#include "libraryInterfaces_InvertInterface.h"
#include "Invert.h"
#include "../Pixel.h"

using namespace std;

void Invert(vector<vector<Pixel>>& imageVector){
    for(int i = 0; i < imageVector.size(); i++){
        for(int j = 0; j < imageVector[i].size(); j++){
            imageVector[i][j].r = 255 - imageVector[i][j].r;
            imageVector[i][j].g = 255 - imageVector[i][j].g;
            imageVector[i][j].b = 255 - imageVector[i][j].b;
        }
    }
}

