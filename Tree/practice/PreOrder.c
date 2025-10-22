#include<stdio.h>

struct node{
    struct node* left;
    struct node* right;
    int data;
};


struct node * createNode(int data){
    struct node *n;
    n=(struct node *)malloc(sizeof(struct node));
    n->left=NULL;
    n->right=NULL;
    n->data=data;
}

int main(){

    struct node * p=createNode(4);
    struct node * p1=createNode(1);
    struct node * p2=createNode(6);
    struct node * p3=createNode(5);
    struct node * p4=createNode(2);
    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;

    return 0;
}